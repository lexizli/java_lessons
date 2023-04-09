/*
 * Реализовать разность массивов и симметрическую разность.
 */

package homework3.tasks;

import java.util.Arrays;

public class Task4 {
    public static void run() {

        int[] wrkArray1 = new int[5];
        int[] wrkArray2 = new int[7];

        wrkArray1 = fillArray(wrkArray1);
        wrkArray2 = fillArray(wrkArray2);
        System.out.println("Array 1 —>\t\t" + arrayToString(wrkArray1));
        System.out.println("\nArray 2 —>\t\t" + arrayToString(wrkArray2));

        int[] arrDiffOne = arrayDifference(wrkArray1, wrkArray2);
        int[] arrDiffTwo = arrayDifference(wrkArray2, wrkArray1);
        int[] arrSymmDiff = arraySumm(arrDiffOne, arrDiffTwo, arrDiffOne.length + arrDiffTwo.length);
        System.out.println("\nDifference —>\t\t" + arrayToString(arrDiffOne)
                + "\n\nDifference 2 —>\t\t" + arrayToString(arrDiffTwo)
                + "\n\nSymmetric Difference— —> "
 //               + arrayToString(arrSymmDiff) + "\n");
 + Arrays.toString(arrSymmDiff) + "\n");

    }

    private static int[] arraySumm(int[] arrayDifference, int[] arrayDifference2, int arrSize) {
        int[] result = new int[arrSize];
        int lenghOne = arrayDifference.length;
        int lengthTwo = arrayDifference.length + arrayDifference2.length;
        for (int i = 0; i < lenghOne; i++) {
            result[i] = arrayDifference[i];
        }
        for (int i = lenghOne; i < lengthTwo; i++) {
            result[i] = arrayDifference2[i - lenghOne];
        }
        return result;
    }

    public static int[] arrayDifference(int[] wrkArray1, int[] wrkArray2) {
        int countNew = 0;
        boolean counterStep = true;
        for (int num : wrkArray1) {
            counterStep = true;
            for (int secNum : wrkArray2) {
                if (num == secNum) {
                    counterStep = false;
                    break;
                }
            }
            countNew += counterStep ? 1 : 0;
        }
        // System.out.println("countNew> " + countNew);
        int[] result = new int[countNew];
        int counter = 0;

        for (int num : wrkArray1) {
            counterStep = true;
            for (int secNum : wrkArray2) {
                if (num == secNum) {
                    counterStep = false;
                    break;
                }
            }
            if (counterStep) {
                result[counter] = num;
                counter++;
            }

        }
        return result;
    }

    public static int[] arraySymmetrycDifference(int[] wrkArray1, int[] wrkArray2) {

        return null;
    }

    //

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
