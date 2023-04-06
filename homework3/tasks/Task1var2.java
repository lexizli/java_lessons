//  Реализовать алгоритм сортировки слиянием

// Этот годный и на мой взгляд красивее

package homework3.tasks;

public class Task1var2 {

    public static void run() {

        int[] wrkArray = new int[7];

        wrkArray = fillArray(wrkArray);
        System.out.print("Unsorted ");
        System.out.println(arrayToString(wrkArray));

        mergeSort(wrkArray, wrkArray.length);

        System.out.println(arrayToString(wrkArray));

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

    public static void mergeSort(int[] a, int n) {
//        System.out.println(" 49  n ->  " + n);
//        System.out.println(arrayToString(a));
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

}
