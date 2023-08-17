package algo2;

import java.util.Arrays;

import algo2.task.*;

public class Main {
    public static void main(String[] args) {
        
    int[] x = new int[100000];
    x = FillArray.fillArray(x);
    System.out.println("Было");
    System.out.println(Arrays.toString(x));
    
    int low = 0;
    int high = x.length - 1;
    
    QuickSort.quickSort(x, low, high);
    System.out.println("Стало");
    System.out.println(Arrays.toString(x));

    int target = 9;

    int result = BinarySearch.binarySearch(x, target);
    if (result != -1) {
        System.out.println("Найден —> " + result);
    } else {
        System.out.println("Не осилил");
    }

     int result1 = BinarySearch.binarySearchRecursive(x, target, 0, x.length - 1);
        if (result1 != -1) {
            System.out.println("Найден —> " + result);
        } else {
            System.out.println("Не сдюжил");
        }
    }
}
