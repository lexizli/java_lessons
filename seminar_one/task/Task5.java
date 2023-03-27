package seminar_one.task;

import java.util.Objects;
import java.util.Scanner;

public class Task5 {

public static void run() {
    Scanner scanner = new Scanner(System.in);

    while (true) {
    //    System.out.print("\033[H\033[J");
        System.out.print("\nInput any sentences or exit for exit > ");

        String stg = removePunctuations(scanner.nextLine());

 //       System.out.println(stg);

        String[] partsOfInput = stg.split(" ");

        if (Objects.equals(partsOfInput[0],"exit")){
            System.out.println("EXIT!!!");
            break;
        }
        for (int index = partsOfInput.length - 1; index >= 0; index--) {
            System.out.print(partsOfInput[index] + " ");
        }
   
    }
    scanner.close();
}

public static String removePunctuations(String source) {
    return source.replaceAll("\\p{Punct}", "");
}

}


/*
    public static void run() {
        Task5 s = new Task5();

        s.test22();
    }
    public void test22() {
        System.out.println("Сидели два медведика!");
        
    }

}
*/
