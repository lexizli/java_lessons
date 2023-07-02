package prom_attest1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ToyManager toyManager = new ToyManager();

        // Создаем файл для хранения игрушек, если его еще нет
        toyManager.createFileIfNotExists("toys.csv");

        // Загружаем список игрушек из файла
        toyManager.loadToys("toys.csv");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить новую игрушку");
            System.out.println("2. Редактировать данные игрушки (количество или вероятность) по ID");
            System.out.println("3. Проведение розыгрыша");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");
            if (scanner.hasNextInt()) { // Проверяем, есть ли ввод
                int choice = scanner.nextInt();
                scanner.nextLine(); // Считываем оставшийся символ новой строки
                switch (choice) {
                    case 1:
                        toyManager.addNewToys("toys.csv");
                        while (scanner.hasNextLine()) { // Пропускаем все введенные строки
                            scanner.nextLine();
                        }
                        break;
                    case 2:
                        System.out.print("Введите ID игрушки, которую хотите отредактировать: ");
                        int id = scanner.nextInt();
                        scanner.nextLine(); // Считываем оставшийся символ новой строки
                        toyManager.editToyById(id);
                        toyManager.saveToys("toys.csv");
                        toyManager.loadToys("toys.csv");
                        break;
                    case 3:
                        // Розыгрыш игрушек
                        Toy winner = toyManager.play();
                        if (winner != null) {
                            System.out.println("\n\nПобедитель розыгрыша: " + winner);
                        }

                        // Розыгрыш игрушек и сохранение победителя в файл
                        toyManager.saveWinnersToFile("winners.txt", winner);

                        // Сохранение изменений после розыгрыша в файл
                        System.out.println("\n\n==============   После розыгрыша   ================ \n");
                        toyManager.saveToys("toys.csv");
                        toyManager.printToys();
                        break;
                    case 0:
                        System.out.println("Выход из программы...");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Некорректный выбор - 63. Повторите попытку.");
                        while (scanner.hasNextLine()) { // Пропускаем все введенные строки
                            scanner.nextLine();
                        }

                }
            } else {
                System.out.println("Некорректный выбор - 70. Повторите попытку.");
                scanner.nextLine(); // Считываем оставшийся символ новой строки
            }
        }
    }
}
