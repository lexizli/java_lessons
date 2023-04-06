package seminar_one.task;

public class Task4 {
    public static void run() {
        int[] digits = {3, 2, 2, 3, 4, 6, 7, 2, 3, 3, 9, 1, 0, 3, 5, 1};
        int toSort = 3;
        int last = digits.length - 1;

        for (int i : digits){ 
            System.out.print(i + "  ");
        }
        System.out.println("  ");
        
        for (int i = 0; i < last; i++) {

           // for (int i : digits) {
            if (digits[i] == toSort) {
                System.out.println(i + "  " + digits[i]);

                while (digits[last] == toSort) {
                    last--;
                }
                digits[i] = digits[last];
                digits[last] = toSort;
                last--;

            } 
        }
        for (int i : digits){
             
            System.out.print(i + "  ");
        }


    }
    
}
