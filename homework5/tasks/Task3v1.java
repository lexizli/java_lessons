package homework5.tasks;

import java.util.Arrays;

public class Task3v1 {

    public static int swopCount = 0;

    public static void run() {

        // int[] wrkArray = { 10, 0, 52, -2, 17, 333, 1};
        int[] wrkArray = { 15, -10, -5, 0, 5, 10, 2 };
        int lenArray = wrkArray.length;

        //
        System.out.println("Unsorted  \t" + Arrays.toString(wrkArray));

        sortHeap(wrkArray, lenArray);

        System.out.println("Sorted  \t" + Arrays.toString(wrkArray));
    }

    private static void sortHeap(int[] sArr, int lenArray) {

        int temp;
        int aSize = lenArray - 1;
        for (int i = ( lenArray / 2 ); i >= 0; i--) {

            // System.out.println("27\t" + Arrays.toString(sArr) + "\tswopCount = " + swopCount);
            heapify(sArr, i, aSize);
            // System.out.println("29\t \t" + Arrays.toString(sArr) + "\tswopCount = " + swopCount);
        }

        for (int i = aSize; i >= 0; i--) {

            temp = sArr[0];
            sArr[0] = sArr[aSize];
            sArr[aSize] = temp;
            swopCount++;

            aSize--;
            // System.out.println("40 \t" + Arrays.toString(sArr) + "\tswopCount = " + swopCount);
            heapify(sArr, 0, aSize);
            // System.out.println("42\t \t" + Arrays.toString(sArr) + "\tswopCount = " + swopCount);

    }
}

    private static void heapify(int[] myArray, int i, int heapSize) {
        int iLeft = i * 2;
        int iRight = i * 2 + 1;
        int largest;

        if (iLeft <= heapSize && myArray[iLeft] > myArray[i]) {
            largest = iLeft;
        } else {
            largest = i;
        }

        if (iRight <= heapSize && myArray[iRight] > myArray[i]) {
            largest = iRight;
        }

        if (largest != i) {
            int temp = myArray[i];
            myArray[i] = myArray[largest];
            myArray[largest] = temp;
            swopCount++;

            heapify(myArray, largest, heapSize);
        }

    }

}
