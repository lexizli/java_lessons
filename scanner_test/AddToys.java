package scanner_test;

import java.util.*;

public class AddToys {

    public static void addToys() {

        try (Scanner scanner = new Scanner(System.in)) {
            String answer;
            answer = "1";

            do {
                System.out.print("Введите ID игрушки (0 — пропустить ввод игрушек): ");
                int id = scanner.nextInt();

                if (id == 0) {
                     break;
                }

                if (id == 1) {
                    System.out.println("class AddToys — Case 1 selected.");
                    continue;
                }

            } while (answer.equals("1"));
        } 
    }
}

