package prom_attest1;

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

    // // Метод для добавления новых игрушек в файл
    // public void addNewToys(String filename) {

    //     boolean ifWrite = true;

    //     try (Scanner scanner = new Scanner(System.in);
    //             PrintWriter writer = new PrintWriter(new FileWriter(filename, true))) {

    //         String answer;
    //         do {
    //             System.out.print("Введите ID игрушки (0 — пропустить ввод игрушек): ");
    //             int id = scanner.nextInt();
    //             if (id == 0) {
    //                 ifWrite = false;
    //                 break;
    //             }
    //             scanner.nextLine(); // считываем символ новой строки

    //             System.out.print("Введите наименование игрушки: ");
    //             String name = scanner.nextLine();

    //             System.out.print("Введите вероятность выигрыша игрушки: ");
    //             double probability = scanner.nextDouble();
    //             scanner.nextLine();

    //             System.out.print("Введите количество игрушек: ");
    //             int quantity = scanner.nextInt();
    //             scanner.nextLine();

    //             Toy toy = new Toy(id, name, probability, quantity);
    //             toys.add(toy);
    //             writer.println(
    //                     toy.getId() + ";" + toy.getName() + ";" + toy.getProbability() + ";" + toy.getQuantity());

    //             System.out.print("Хотите добавить еще игрушку? (1/0): ");
    //             answer = scanner.nextLine();
    //         } while (answer.equals("1"));

    //         if (ifWrite) {
    //             System.out.println("Игрушки успешно добавлены в файл " + filename);
    //         }
    //     } catch (IOException e) {
    //         System.out.println("Ошибка при записи в файл.");
    //     }
    // }

    // добавление игрушек. Новый вариант с уникальным ID
    public void addNewToys(String filename) {
        boolean ifWrite = true;
        Set<Integer> ids = new HashSet<>(); // создаем HashSet для хранения уникальных ID
    
        // Сначала считываем данные из файла и заполняем HashSet
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
                writer.println(toy.getId() + ";" + toy.getName() + ";" + toy.getProbability() + ";" + toy.getQuantity());
    
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

    // Изменяем количество игрушек с конкретным ID
    public void changeQuantity(int id, int newQuantity) {
        for (Toy toy : toys) {
            if (toy.getId() == id) {
                toy.setQuantity(newQuantity);
                break;
            }
        }
    }

    // Изменяем вероятность для игрушки с конкретным ID
    public void changeProbability(int id, double newProbability) {
        for (Toy toy : toys) {
            if (toy.getId() == id) {
                toy.setProbability(newProbability);
                break;
            }
        }
    }

    public void editToyById(int id) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Выберите параметр для редактирования:");
            System.out.println("1. Количество игрушек");
            System.out.println("2. Вероятность");
   
            System.out.print("Введите номер параметра: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Считываем оставшийся символ новой строки
   
            switch (choice) {
                case 1:
                    System.out.print("Введите новое количество игрушек: ");
                    int newQuantity = scanner.nextInt();
                    changeQuantity(id, newQuantity);
                    System.out.println("Количество игрушек с ID " + id + " успешно изменено.");
                    break;
                case 2:
                    System.out.print("Введите новую вероятность: ");
                    double newProbability = scanner.nextDouble();
                    changeProbability(id, newProbability);
                    System.out.println("Вероятность игрушки с ID " + id + " успешно изменена.");
                    break;
                default:
                    System.out.println("Некорректный выбор параметра. Редактирование отменено.");
            }
        }
    }

    // Метод для розыгрыша игрушек
    public Toy play() {
        Toy winner = null;
        double maxScore = 0;

        for (Toy toy : toys) {
            double score = toy.getWinningScore();
            if (score > maxScore) {
                maxScore = score;
                winner = toy;
            }
        }

        if (winner != null) {
            winner.setQuantity(winner.getQuantity() - 1);
        }

        return winner;
    }

    // Выводим список игрушек
    public void printToys() {
        for (Toy toy : toys) {
            System.out.println(toy);
        }
    }

        // Сохраняем победителя розыгрыша в отдельный файл
        public void saveWinnersToFile(String filename, Toy winner) {
            try (PrintWriter writer = new PrintWriter(new FileWriter(filename, true))) {
                if (winner != null) {
                    writer.println(winner.getId() + ";" + winner.getName() + ";" + winner.getProbability() + ";"
                            + winner.getQuantity());
                    System.out.println("Победитель розыгрыша сохранен в файл " + filename);
                }
            } catch (IOException e) {
                System.out.println("Ошибка при сохранении победителя розыгрыша.");
            }
        }
}