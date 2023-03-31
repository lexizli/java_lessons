/*
Дано четное число N (>0) и символы c1 и c2. 
Написать метод, который вернет строку длины N, 
которая состоит из чередующихся символов c1 и c2, 
начиная с c1.
*/

package seminar_two.task;

import java.util.Scanner;

public class task1 {
    public static void run() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nInput number and two any characters.\nFor example: 10 A И > ");

        String stg = scanner.nextLine();
        String[] partsOfInput = stg.split(" ");

        int op1 = Integer.parseInt(partsOfInput[0]);

        System.out.println(collectCharsToString(op1, partsOfInput[1], partsOfInput[2]));

        scanner.close();

    }

    public static String collectCharsToString(int number, String a, String b) {

        StringBuilder sb = new StringBuilder();

        int loop = number / 2;
        int tail = number % 2;

        for (int i = 0; i < loop; i++) {
            sb.append(a + b);
        }
        if (tail > 0) {
            sb.append(a);

        }
        return sb.toString();

    }

}
