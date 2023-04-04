
/*
 * Реализовать консольное приложение, которое:
 * Принимает от пользователя строку вида 
 * text:num
 * Нужно сделать “сплит” строки по : , сохранить text в связный список на позицию num.
 * Если введено print:num, выводит строку из позиции num в связном списке и удаляет её из списка.
 */

package seminar_four.tasks;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class Task1 {
    public static void run() {

        Scanner scanner = new Scanner(System.in);
        LinkedList<String> texts = new LinkedList<>();

        while (true) {

            System.out.print(
                    "\nInput, please, \n[text]:num for add text to list, \nprint:num for print and remove text from position num \nor exit for end\n\t —> ");

            String stg = scanner.nextLine();
            String[] partsOfInput = stg.split(":");

            if (partsOfInput.length > 1 && isNumeric(partsOfInput[1])) {

                int pos = Integer.parseInt(partsOfInput[1]);
                if (pos > texts.size()) {
                    for (int index = 0; index < pos; index++) {
                        texts.add(null);
                    }
                }
                if (pos >= 0) {
                    if (partsOfInput[0].equals ("print")) {
                        System.out.println(texts.get(pos));
                        texts.remove(pos);
                    } else {
                        texts.add(pos, partsOfInput[0]);
                    }
                }
            }

            if (Objects.equals(partsOfInput[0], "exit")) {
                System.out.println("EXIT!!!");
                break;
            }

        }
        System.out.println(texts);

        scanner.close();

    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
