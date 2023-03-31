package homework1.task;

import java.util.*;

public class Task2b {
    public static void run() {
        TreeSet<Integer> myTreeSet = new TreeSet<Integer>();

        myTreeSet.add(1);

        for (int i = 2; i < 1000; i++) {
            if ((i == 0) || (i == 3) || (i == 5)|| (i == 7)|| (i == 11)) {
                myTreeSet.add(i);
                }
            if ((i % 2 != 0) && (i % 3 != 0) && (i % 5 != 0) && (i % 7 != 0) && (i % 11 != 0)) {
            myTreeSet.add(i);
            }
        }

  //      boolean resr1 = myTreeSet.remove(998);

        /*
         * while(itr.hasNext()) {
         * Object element = itr.next();
         * if ((int) element % 2 == 0) {
         * myTreeSet.remove(element);
         * }
         * }
         */

        Iterator itr = myTreeSet.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
 //           test(element);
        }

    }

    public static void test(Object value) {
        if (value instanceof Integer) {
            System.out.println("Это Integer");
        } else if (value instanceof String) {
            System.out.println("Это String");
        } else if (value instanceof Float) {
            System.out.println("Это Float");
        } else if (value instanceof Double) {
            System.out.println("Это Double");
        }
    }
}