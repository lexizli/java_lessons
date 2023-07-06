package prom_attest1_v2;

import java.io.*;
import java.util.*;

public class AddToys {
    public static void addToys(String filename, ToyManager toyManager) {
        List<Toy> toys = toyManager.getToys();
        boolean ifWrite = true;
        Set<Integer> ids = new HashSet<>();
        try (Scanner fileScanner = new Scanner(new File(filename))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] data = line.split(";");

                int id = Integer.parseInt(data[0]);
                ids.add(id);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл " + filename + " не найден.");
        }

        try (Scanner scanner = new Scanner(System.in);
                PrintWriter writer = new PrintWriter(new FileWriter(filename, true))) {
            String answer;
            answer = "1";
            do {
                System.out.print("Введите ID игрушки (0 — пропустить ввод игрушек): ");
                int id = scanner.nextInt();
                if (id == 0) {
                    ifWrite = false;
                    scanner.nextLine();
                     break;
                }

                if (ids.contains(id)) {
                    System.out.println("Игрушка с таким ID уже существует. Попробуйте снова.");
                    continue;
                }
                ids.add(id);

                scanner.nextLine();

                System.out.print("Введите наименование игрушки: ");
                String name = scanner.nextLine();

                System.out.print("Введите вероятность выигрыша игрушки: ");
                double probability = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Введите количество игрушек: ");
                int quantity = scanner.nextInt();
                scanner.nextLine();

                Toy toy = new Toy(id, name, probability, quantity);
                toys.add(toy);
                writer.println(
                        toy.getId() + ";" + toy.getName() + ";" + toy.getProbability() + ";" + toy.getQuantity());

                System.out.print("Хотите добавить еще игрушку? (1/0): ");
                answer = scanner.nextLine();
            } while (answer.equals("1"));

            if (ifWrite) {
                System.out.println("Игрушки успешно добавлены в файл " + filename);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл.");
        }
    }
}