/*
 * Задан целочисленный список ArrayList. 
 * Найти минимальное, максимальное и среднее арифметическое этого списка.
 */

package homework3.tasks;

public class Task3 {
    public static void run() {

        int[] wrkArray = new int[7];

        wrkArray = fillArray(wrkArray);
        System.out.println("Array —> " + arrayToString(wrkArray));
        System.out.println("Max—> " + arrayMax(wrkArray)
                + "\tMin —> " + arrayMin(wrkArray)
                + "\tAverage —> " + arrayAverage(wrkArray));

    }

    private static int arrayAverage(int[] wrkArray) {
        int arraySum = 0;
        for (int num : wrkArray) {
            arraySum += num;
        }
        return arraySum / wrkArray.length;
    }

    private static int arrayMin(int[] wrkArray) {
        int arrayMin = wrkArray[0];
        for (int num : wrkArray) {
            if (num < arrayMin) {
                arrayMin = num;
            }
        }
        return arrayMin;
    }

    private static int arrayMax(int[] wrkArray) {
        int arrayMax = wrkArray[0];
        for (int num : wrkArray) {
            if (num > arrayMax) {
                arrayMax = num;
            }
        }
        return arrayMax;
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
