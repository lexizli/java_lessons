package prom_attest1_v2;

import java.io.*;
import java.util.*;

public class ToyManager {
    private List<Toy> toys;

    public ToyManager() {
        toys = new ArrayList<>();
    }

    // Создаем файл toys.csv, если его нет
    public void createFileIfNotExists(String filename) {
        File file = new File(filename);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("Файл " + filename + " успешно создан.");
            } catch (IOException e) {
                System.out.println("Ошибка при создании файла.");
            }
        }
    }

    // Читаем список игрушек из файла
    public void loadToys(String filename) {

        try (Scanner scanner = new Scanner(new File(filename))) {

            toys.clear(); // Очищаем массив игрушек

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(";");
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                double probability = Double.parseDouble(data[2]);
                int quantity = Integer.parseInt(data[3]);
                toys.add(new Toy(id, name, probability, quantity));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        }
    }

    // Сохраняем список игрушек в файл
    public void saveToys(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (Toy toy : toys) {
                writer.println(
                        toy.getId() + ";" + toy.getName() + ";" + toy.getProbability() + ";" + toy.getQuantity());
            }
            System.out.println("Список игрушек успешно сохранен в файл " + filename);
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении списка игрушек в файл.");
        }
    }

        // Выводим список игрушек
        public void printToys() {
            for (Toy toy : toys) {
                System.out.println(toy);
            }
        }


        public List<Toy> getToys() {
            return toys;
        }
}