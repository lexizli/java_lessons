package seminar_three.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task1 {
    public static void run() {
        List<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbersList.add((int) (Math.random() * 20));
        }
        System.out.println(numbersList);
 //       Collections.sort(numbersList);
        numbersList.sort(Comparator.naturalOrder());
        System.out.println(numbersList);

    }






}
