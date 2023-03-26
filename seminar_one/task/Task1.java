package seminar_one.task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//import javax.print.PrintService;

public class Task1 {
    public static void run() {
        System.out.print("\033[H\033[J");
        System.out.println("Чуваки, эта хрень работает!\n");

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("Дата: dd.MM.yyyy время: hh ч. mm мин. ss сек.\n");
        System.out.println(formatter.format(now));
    }
    
    
}
