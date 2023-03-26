/*
 * Вычислить n-ое треугольного число (сумма чисел от 1 до n)
 */
package homework1.task;
import java.util.Scanner;


public class Task1 {
    public static void run() {

        System.out.print("\033[H\033[J");
        System.out.print("Input integer > ");

        Scanner scanner = new Scanner(System.in);
        int triangleBase = scanner.nextInt();
        scanner.close();

        int triangleNumber = (int) (triangleBase * (triangleBase + 1) * 0.5);

        System.out.println("Threangle number for " + triangleBase + " is " + triangleNumber);
        
        long factorial = 1;
        for (int i = 1; i < triangleBase+1; i++) {
            factorial *= i;    
        }
        if (triangleBase < 21) {
            System.out.println("Factorial for " + triangleBase + " is " + factorial);
        } else {
            System.out.println("Sorry, inputed number is too big to calculate factorial");
        }

   }
    
}
