// *(HARD) 
// Реализовать алгоритм пирамидальной сортировки (HeapSort).
// Делайте по желанию.
// 

package homework5.tasks;

import java.util.Arrays;

public class Task3v1 {
    public static final int SIZE_OF_ARRAY = 14;

    public static void run() {

        int[] wrkArray = new int[SIZE_OF_ARRAY];
        wrkArray = fillArray(wrkArray);
        int lenArray = wrkArray.length;

        System.out.println("Unsorted  \t" + Arrays.toString(wrkArray));
        sortHeap(wrkArray, lenArray);
        System.out.println("Sorted  \t" + Arrays.toString(wrkArray));
    }

    private static void sortHeap(int[] sArr, int lenArray) {

        int temp;
        int aSize = lenArray - 1;
        for (int i = (lenArray / 2); i >= 0; i--) {
            heapify(sArr, i, aSize);
        }

        for (int j = aSize; j >= 0; j--) {

            temp = sArr[0];
            sArr[0] = sArr[aSize];
            sArr[aSize] = temp;
            aSize--;
            heapify(sArr, 0, aSize);

        }
    }

    private static void heapify(int[] myArray, int i, int heapSize) {
        int a = i * 2;
        int b = i * 2 + 1;
        int largest;

        if (a <= heapSize && myArray[a] > myArray[i]) { // Here you can change sorting direction - 1
            largest = a;
        } else {
            largest = i;
        }

        if (b <= heapSize && myArray[b] > myArray[largest]) { // Here you can change sorting direction - 2
            largest = b;
        }

        if (largest != i) {
            int temp = myArray[i];
            myArray[i] = myArray[largest];
            myArray[largest] = temp;

            heapify(myArray, largest, heapSize);
        }

    }

    // fill integer array with random values
    public static int[] fillArray(int[] myArray) {

        int borders = myArray.length;

        for (int i = 0; i < borders; i++) {
            myArray[i] = (int) (Math.random() * borders * Math.pow(-1, i));
        }
        return myArray;

    }

}
