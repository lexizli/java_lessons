/*
 * Пусть дан произвольный список целых чисел, удалить из него чётные числа
 */

package homework3.tasks;

public class Task2 {

    public static void run() {

        int[] wrkArray = new int[17];

        wrkArray = fillArray(wrkArray);
        System.out.println("Full —> " + arrayToString(wrkArray));
        int[] result = clearEvenNumbers(wrkArray);
        System.out.println("Cleared—> " + arrayToString(result));

    }

    // delete even numbers from integer array
    private static int[] clearEvenNumbers(int[] wrkArray) {
        int countOdd = 0;
        for (int num : wrkArray) {
            if (num % 2 != 0) {
                countOdd++;
            }
        }
        int[] result = new int[countOdd];
        countOdd = 0;
        for (int num : wrkArray) {
            if (num % 2 != 0) {
                result[countOdd] = num;
                countOdd++;
            }
        }
        return result;
    }
    // fill integer array with random values
    public static int[] fillArray(int[] myArray) {

        int borders = myArray.length;

        for (int i = 0; i < borders; i++) {
            myArray[i] = (int) (Math.random() * borders * 2);
        }
        return myArray;

    }

    // collect array in string for output
    public static String arrayToString(int[] myArray) {

        String outArray = new String();
        outArray = "\t";
        int border = myArray.length;
        for (int i = 0; i < border; i++) {
            outArray += (Integer.toString(myArray[i]) + "  ");
        }
        return outArray;

    }
}
