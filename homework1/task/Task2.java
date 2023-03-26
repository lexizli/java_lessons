
/*
* Вывести все простые числа от 1 до 1000
*/
package homework1.task;

public class Task2 {
    public static void run() {
        for (int i = 2; i < 1000; i++) {
            if (isSimpleNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isSimpleNumber(int testedNumber) {
        boolean simpleNumber = true;
        for (int i = 2; i < Math.sqrt(testedNumber); i++) {
            if (testedNumber % i == 0) {
                simpleNumber = false;
            }
        }
        return simpleNumber;
    }
}
