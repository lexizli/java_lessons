//  Реализовать алгоритм сортировки слиянием
//  Практически аналог  Task1var2 но
//  с 36 по 72 строки made by chatGPT 3.5 

package homework3.tasks;

import java.util.ArrayList;

public class Task1var3 {

    public static final int LOOPS = 9;

    public static void run() {

        ArrayList<Integer> wrkArray = new ArrayList<>(LOOPS);

        wrkArray = fillArray(wrkArray);

        System.out.println("List before sorting: " + wrkArray);
        mergeSort(wrkArray);
        System.out.println("List after sorting: " + wrkArray);

    }

    // fill integer array with random values
    public static ArrayList<Integer> fillArray(ArrayList<Integer> wrkArray) {

        int borders = LOOPS;

        for (int i = 0; i < borders; i++) {
            wrkArray.add((int) (Math.random() * borders * 2));
        }
        return wrkArray;

    }

    public static void mergeSort(ArrayList<Integer> list) {
        if (list.size() <= 1) {
            return;
        }

        int mid = list.size() / 2;
        ArrayList<Integer> left = new ArrayList<>(mid);
        ArrayList<Integer> right = new ArrayList<>(list.size() - mid);

        for (int i = 0; i < mid; i++) {
            left.add(list.get(i));
        }
        for (int j = mid; j < list.size(); j++) {
            right.add(list.get(j));
        }

        mergeSort(left);
        mergeSort(right);
        merge(list, left, right);
    }

    public static void merge(ArrayList<Integer> list, ArrayList<Integer> left, ArrayList<Integer> right) {
        int i = 0, j = 0, k = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i) < right.get(j)) {
                list.set(k++, left.get(i++));
            } else {
                list.set(k++, right.get(j++));
            }
        }
        while (i < left.size()) {
            list.set(k++, left.get(i++));
        }
        while (j < right.size()) {
            list.set(k++, right.get(j++));
        }
    }
}
