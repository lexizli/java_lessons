package algo2.task;

import java.util.Arrays;

public class QuickSort {
    
public static void quickSort(int[] array, int low, int high) {
    if (array.length == 0)
        return;     //  если длина массива 0

    if (low >= high)
        return;     // если уже нечего делить

    // выбираем опорный 
    int middle = low + (high - low) / 2;
    int opora = array[middle];

    // делим на подмассивы
    int i = low, j = high;
    while (i <= j) {
        while (array[i] < opora) {
            i++;
        }

        while (array[j] > opora) {
            j--;
        }

        if (i <= j) {       //  меняем местами
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }

    // вызов рекурсии для сортировки левой и правой части
    if (low < j)
        quickSort(array, low, j);

    if (high > i)
        quickSort(array, i, high);
}


}