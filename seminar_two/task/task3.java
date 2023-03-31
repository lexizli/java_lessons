/*
 * Напишите метод, который вернет содержимое текущей папки в виде массива строк. 
 * Напишите метод, который запишет массив, возвращенный предыдущим методом в файл. 
 * Обработайте ошибки с помощью try-catch конструкции. 
 * В случае возникновения исключения, оно должно записаться в лог-файл.
 */
package seminar_two.task;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class task3 {

    private static final Logger LOG = Log.log(task3.class.getName());


    public static void writeFile(String path) {
        try (FileWriter in = new FileWriter("task3.txt")) {
            String[] data = getFilesInFolder(path);
            for (String datStr : data){
                in.append(datStr + "\n");
            }
            LOG.log(Level.INFO,"Recorded! :)");
            //System.out.println("Recorded! ");
            throw new IOException("Error!");
        } catch (IOException e) {
            LOG.log(Level.INFO, e.getMessage());
            throw new RuntimeException(e);
        }
        
    }



    public static String[] getFilesInFolder(String path) {
        File dir = new File(path);
        String[] result = null;
        File[] files;

        if (dir.isDirectory()) {
            files = dir.listFiles();
            if (files != null) {
                result = new String[files.length];
                for (int i = 0; i < files.length; i++) {
                    String name = files[i].getName();
                    if (files[i].isFile()) {
                        System.out.println("\tFile — " + name);
                        LOG.info("Some message");
                    } else {
                        System.out.println("Directory — " + name);
                    }
                    result[i] = name;
                }
            }
        } else {
            System.out.println(dir.getName() + " is not a directory");
        }
        return result;

    }
    
}
