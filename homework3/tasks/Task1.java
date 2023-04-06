//  Реализовать алгоритм сортировки слиянием

// Этот вариант можно не считать, не понравился, показался некрасивым, хоть и работает.

package homework3.tasks;

import java.util.Arrays;

public class Task1 {


    public static void run() {

        int[] wrkArray = new int[7];

        wrkArray = fillArray(wrkArray);
        System.out.print("Unsorted ");
        System.out.println(arrayToString(wrkArray));

        int[] buffer1 = Arrays.copyOf(wrkArray, wrkArray.length);
        int[] buffer2 = new int[wrkArray.length];

        int[] result = mergeSortInner(buffer1, buffer2, 0, wrkArray.length);

        System.out.println(arrayToString(result));
 
    }


//  fill integer array with random values
    public static int[] fillArray(int[] myArray) {

        int borders = myArray.length;

        for (int i = 0; i < borders; i++) {
            myArray[i] = (int) (Math.random() * borders * 2);
        }
        return myArray;

    }

//  sort array 
    public static int[] mergeSortInner(int[] buf1, int[] buf2, int first, int last) {
        System.out.println(" 42  first ->  " + first + " last -> " + last);
        System.out.println(arrayToString(buf1));
        System.out.println(arrayToString(buf2));
        System.out.println(45);

        if (first >= last - 1) {
            return buf1;
        }

        int mid = first + (last - first) / 2;
        int[] sortedOne = mergeSortInner(buf1, buf2, first, mid);
        int[] sortedTwo = mergeSortInner(buf1, buf2, mid, last);

        System.out.println("55 mid -> " + mid + " first ->  " + first + " last -> " + last);
        System.out.println(arrayToString(sortedOne));
        System.out.println(arrayToString(sortedTwo));



        int ind1 = first;
        int ind2 = mid;
        int[] result = sortedOne == buf1 ? buf2 : buf1;
        System.out.println("64 result -> " + arrayToString(result));
        System.out.println("65 mid/ind2 -> " + mid + "/" + ind2 
        +" first/ind1 ->  " + first + "/" + ind1 + " last -> " + last);
        while (ind1 < mid && ind2 < last) {
            result[first++] = sortedOne[ind1] < sortedTwo[ind2] ? sortedOne[ind1++] : sortedTwo[ind2++];
        }

        while(ind1 < mid) {
            result[first++] = sortedOne[ind1++];
        }

        while(ind2 < last) {
            result[first++] = sortedTwo[ind2++];
        }
        System.out.println("79 result -> " + arrayToString(result));

        return result;
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

