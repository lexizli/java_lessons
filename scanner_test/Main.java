package scanner_test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить новую игрушку");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            if (scanner.hasNextInt()) { // Проверяем, есть ли ввод
                int menuChoice = scanner.nextInt();
                scanner.nextLine(); // Считываем оставшийся символ новой строки

                switch (menuChoice) {
                    case 1:
                        System.out.print("Case 1 selected ");
                        AddToys.addToys();
                        break;
                    case 0:
                        System.out.println("Выход из программы...");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Некорректный выбор - 63. Повторите попытку.");
                }

            } else {
                System.out.println("Некорректный выбор - 81. Повторите попытку.");
                scanner.next(); // Считываем символ новой строки после некорректного ввода
                if (!scanner.hasNextLine()) {
                    continue; // Если больше нет строк в потоке ввода, выходим из цикла
                }

            }
        }
    }
}
