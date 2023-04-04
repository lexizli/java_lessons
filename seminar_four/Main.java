package seminar_four;

import java.util.Stack;

import seminar_four.tasks.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("\033[H\033[J");
        // Task3.run();

        OurNewStack superstack = new OurNewStack();

        superstack.push(123);
        superstack.push(234);
        superstack.push(345);
        superstack.push(456);


        for (int i = 0; i < superstack.getCapacity(); i++) {
            System.out.println(superstack.pop());
        }

 //       for (int i = 0; i < superstack.getCapacity()-1; i++) {
  //          System.out.println(superstack.pop());
  //      }

    }
}