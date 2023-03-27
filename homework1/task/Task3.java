/*
 * Реализовать простой калькулятор
 */
package homework1.task;

import java.util.Objects;
import java.util.Scanner;

public class Task3 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
 //           System.out.print("\033[H\033[J");
            System.out.print("\nInput arithmetical task — two numbers and operation through space or exit.\nFor example: 2 * 2 > ");

            String stg = scanner.nextLine();
            String[] partsOfInput = stg.split(" ");

            if (Objects.equals(partsOfInput[0],"exit")){
                System.out.println("EXIT!!!");
                break;
            }
            float op1 = Float.parseFloat(partsOfInput[0]);
            float op2 = Float.parseFloat(partsOfInput[2]);

            switch (partsOfInput[1]) {
                case "+":  System.out.println(op1 + op2 );
                break;
                case "*":  System.out.println(op1 * op2 );
                break;
                case "-":  System.out.println(op1 - op2 );
                break;
                case "/":  System.out.println(op1 / op2 );
                break;
            }
        }
        scanner.close();
    }

}
