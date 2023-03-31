/*
 * Напишите метод, который составит строку, 
 * состоящую из 100 повторений слова TEST и метод, 
 * который запишет эту строку в простой текстовый файл, 
 * обработайте исключения.
 */

package seminar_two.task;

import java.io.FileWriter;
import java.io.IOException;

public class task4 {
    public static void run() {
        writeInFile();
    }

    public static void writeInFile() {

        try (FileWriter in = new FileWriter("test.txt")) {
            in.append(oneHundredTests());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String oneHundredTests() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            builder.append("TEST");
    }
    return  builder.toString();
    // return "TEST".repeat(100); короткая запись
}

}
