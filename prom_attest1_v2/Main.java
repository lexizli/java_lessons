package prom_attest1_v2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ToyManager toyManager = new ToyManager();

        // Создаем файл для хранения игрушек, если его еще нет
        toyManager.createFileIfNotExists("toys.csv");

        // Загружаем список игрушек из файла
        toyManager.loadToys("toys.csv");

        toyManager.printToys();

        Scanner scanner = new Scanner(System.in);

        int menuChoice = 5;

        while (menuChoice != 0) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить новую игрушку");
            System.out.println("2. Редактировать данные игрушки (количество или вероятность) по ID");
            System.out.println("3. Проведение розыгрыша");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            if (scanner.hasNextInt()) { // Проверяем, есть ли ввод
                menuChoice = scanner.nextInt();
                scanner.nextLine(); // Считываем оставшийся символ новой строки

                switch (menuChoice) {
                    case 1:
                    System.out.print("Case 1 selected ");
                        AddToys.addToys("toys.csv", toyManager);
                        menuChoice = 5;
                        // while (scanner.hasNextLine()) { // Пропускаем все введенные строки
                        //     scanner.nextLine();
                        // }
                        break;
                    case 2:
                    System.out.print("Case 2 selected ");

                            // System.out.print("Введите ID игрушки, которую хотите отредактировать: ");
                            // int id = scanner.nextInt();
                            // scanner.nextLine(); // Считываем оставшийся символ новой строки
                            // toyManager.editToyById(id);
                            // toyManager.saveToys("toys.csv");
                            // toyManager.loadToys("toys.csv");
                        break;
                    case 3:
                    System.out.print("Case 3 selected ");

                        // // Розыгрыш игрушек
                        // Toy winner = toyManager.play();
                        // if (winner != null) {
                        //     System.out.println("\n\nПобедитель розыгрыша: " + winner);
                        // }

                        // // Розыгрыш игрушек и сохранение победителя в файл
                        // toyManager.saveWinnersToFile("winners.txt", winner);

                        // // Сохранение изменений после розыгрыша в файл
                        // System.out.println("\n\n==============   После розыгрыша   ================ \n");
                        // toyManager.saveToys("toys.csv");
                        // toyManager.printToys();
                        break;
                    case 0:
                        System.out.println("Выход из программы...");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Некорректный выбор - 63. Повторите попытку.");
                        // while (scanner.hasNextLine()) { // Пропускаем все введенные строки
                        //     scanner.nextLine();
                        // }

                }
            }
            else {
                System.out.println("Некорректный выбор - 81. Повторите попытку.");
                        menuChoice = 5;

                // scanner.close();

            }
        }
    }
}