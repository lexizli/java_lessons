/*
* Задано уравнение вида q + w = e, q, w, у >= 0
Некоторые цифры могут быть заменены знаком вопроса, например
2? + ?5 = 69
Нужно восстановить все цифры (хотя бы одно решение) или сообщить, что решения нет

Что-то кажется, что постановка неполная. Не хватает ограничения на количество вопросов. Валидно ли будет такое уравнение:
??? + ? = ????
или нет?

Для начала сделаем допущение, что ? — это одна и та же цифра во всех числах
*/
package homework1.task;

import java.util.Scanner;

public class Task4 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nI'll try to solve the task  q + w = e, where q, w, у  integer and >= 0 \n" +
                         "You can use ? to hide one digit in all numbers\n " +
                         "like 2? + ?5 = 69\n\n");
        
        System.out.print("Input q > ");
        String firstNumber = scanner.nextLine();

        System.out.print("Input w > ");
        String secondNumber = scanner.nextLine();

        System.out.print("Input e > ");
        String thirdNumber = scanner.nextLine();

        scanner.close();

        boolean solve = false;
        for (int i = 1; i < 10; i++) {
            if ( whatDigits(firstNumber, i) + whatDigits(secondNumber, i) == whatDigits(thirdNumber, i) ) {
                System.out.println("I hope your digit is " + i);
                solve = true;
            }
        }
        if (!solve) { System.out.println("Sorry, I cant solve your task..."); }

    }

    public static int whatDigits(String testedNumber, int multi) {
        char toFind = '?';
        int power = testedNumber.length() - 1;
        int result = 0;
        for (int i = testedNumber.length() - 1; i >= 0; i--) {
            if (testedNumber.charAt(i) == toFind) {
                result += (int) (Math.pow(10, (power - i))) * multi;
            } else {
                result += Character.getNumericValue(testedNumber.charAt(i)) * (Math.pow(10, (power - i)));
            }
        }
        return result;
    }

}
