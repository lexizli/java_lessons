// *(HARD) 
// Реализовать алгоритм пирамидальной сортировки (HeapSort).
// Делайте по желанию.

package homework5.tasks;

import java.util.Arrays;

public class Task3 {
    public static void run() {

        int[] wrkArray = new int[7];

        wrkArray = fillArray(wrkArray);
        System.out.println("Unsorted  \t" + Arrays.toString(wrkArray));

        sortHeap(wrkArray, 7);

        System.out.println("Sorted  \t" + Arrays.toString(wrkArray));    }

    public static void sortHeap(int[] sortedArray, int length) {
        int temp;
        int size = length - 1;
        for (int i = (length / 2); i >= 0; i--) {
            heapify(sortedArray, i, size);
        }
        ;
        for (int i = size; i >= 0; i--) {
            temp = sortedArray[0];
            sortedArray[0] = sortedArray[size];
            sortedArray[size] = temp;
            size--;
            heapify(sortedArray, 0, size);
        }
        // System.out.println(Arrays.toString(sortedArray));
    }


    public static void heapify (int [] myArray, int i, int heapSize) {
        int a = 2*i;
        int b = 2*i+1;
        int largestElement;
        if (a<= heapSize  && myArray[a] > myArray[i]) {
           largestElement = a;
        } else {
           largestElement = i;
        }
        if (b <= heapSize  && myArray[b] > myArray[largestElement]) {
           largestElement = b;
        }
        if (largestElement != i) {
           int temp = myArray[i];
           myArray[i] = myArray[largestElement];
           myArray[largestElement] = temp;
           heapify(myArray, largestElement, heapSize);
       }
     }

    // fill integer array with random values
    public static int[] fillArray(int[] myArray) {

        int borders = myArray.length;

        for (int i = 0; i < borders; i++) {
            myArray[i] = (int) (Math.random() * borders * 2);
        }
        return myArray;

    }

}
