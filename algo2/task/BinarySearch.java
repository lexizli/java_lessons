package algo2.task;

public class BinarySearch {
    
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (array[mid] == target) {
                return mid;                                     //  найден, возвращаем его индекс
            } else if (array[mid] < target) {
                low = mid + 1;                              // искомый в правой части массива
            } else {
                high = mid - 1;                             // искомый  в левой части массива
            }
        }
        
        return -1;                                              //  не найден
    }

    public static int binarySearchRecursive(int[] array, int target, int low, int high) {
        if (low > high) {
            return -1; //  не найден
        }
        
        int mid = low + (high - low) / 2;
        
        if (array[mid] == target) {
            return mid; //                                                                      найден
        } else if (array[mid] < target) {
            return binarySearchRecursive(array, target, mid + 1, high); // где-то справа
        } else {
            return binarySearchRecursive(array, target, low, mid - 1); // где-то слева
        }
    }
    
}
