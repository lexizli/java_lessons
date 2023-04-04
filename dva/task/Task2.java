package dva.task;

import java.util.Scanner;
//import java.time.LocalDateTime;
import java.time.LocalTime;
// import java.time.format.DateTimeFormatter;

public class Task2 {
    public static void run() {

        System.out.print("\033[H\033[J");
        System.out.print("Имя напиши сюда > ");

        Scanner scanner = new Scanner(System.in);
        String nameSurname = scanner.nextLine();
        scanner.close();

        LocalTime now = LocalTime.now();

        LocalTime time1 = LocalTime.of(5, 0, 0);
        LocalTime time2 = LocalTime.of(12, 0, 0);
        LocalTime time3 = LocalTime.of(18, 0, 0);
        LocalTime time4 = LocalTime.of(23, 0, 0);

        if ( now.compareTo(time1) > 0 &&  now.compareTo(time2) < 0) {
            System.out.println("Доброе утра, " + nameSurname + "!");
        }
        if ( now.compareTo(time2) > 0 &&  now.compareTo(time3) < 0) {
            System.out.println("Добрый день, " + nameSurname + "!");
        }
        if ( now.compareTo(time3) > 0 &&  now.compareTo(time4) < 0) {
            System.out.println("Good evening, " + nameSurname + "!");
        }
        if ( now.compareTo(time4) > 0 &&  now.compareTo(time1) < 0) {
            System.out.println("Ночь на дворе, спи уже, " + nameSurname + "!");
        }
        
    }
    
}
