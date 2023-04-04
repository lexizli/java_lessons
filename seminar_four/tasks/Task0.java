package seminar_four.tasks;

import java.util.ArrayList;
/*
 * 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов. 
 * 
 * 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
 */

import java.util.LinkedList;

public class Task0 {
    public static void run() {
        
        ArrayList<Integer> timeTest = new ArrayList<>();

        long time = System.currentTimeMillis();

        for (int i = 0; i < 1000000000; i++) {

            timeTest.add(i);
            
        }


        System.out.println(System.currentTimeMillis() - time);

        LinkedList<Integer> timeLinkedTest = new LinkedList<>();

        time = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {

            timeLinkedTest.add(i);
            
        }


        System.out.println(System.currentTimeMillis() - time);
    }
    
}
