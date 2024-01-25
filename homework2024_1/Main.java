package homework2024_1;

import java.util.Arrays;

class Expr {

    public static double expr(int a, int b) {
 // Введите свое решение ниже
      double result = 0;
      if (b==0) {
        System.out.println("It's not possible to evaluate the expression - a / b as b = 0.");
      } else {
        result = (double) a/b;
      } 
      printSum(a, b);
    return result;  
}

    public static void printSum(int a, int b) {
 // Введите свое решение ниже
      System.out.println(a + b);
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

public class Main {
    public static void main(String[] args) {
        int a;
        int b;

        if (args.length == 0) {
            a = 12;
            b = 0; // Default values if no arguments are provided
        } else {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        } 

        double result = Expr.expr(a, b);
        System.out.println(result);
    }
}