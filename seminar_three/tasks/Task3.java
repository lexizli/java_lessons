package seminar_three.tasks;

import java.util.ArrayList;


public class Task3 {
    public static ArrayList<String> garbije = new ArrayList<>();

    public static void run() {
        garbije.add("This is a string");
        garbije.add("273");
        garbije.add("Another string");
        garbije.add("5");
        garbije.add("One more string");
        garbije.add("3.1415926");
        garbije.add("This is a string number 4");
        garbije.add("This is a last string");

        int idx = 0;

        while (idx < garbije.size())
        {
        if(isNumber(garbije.get(idx)))
                {
            // Remove item
            garbije.remove(idx);
        }
        else
        {
            ++idx;
        }
        }

        System.out.println(garbije);
    }

    private static boolean isNumber(String s) {
        try {
            Float.parseFloat(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;

    }
   
}


