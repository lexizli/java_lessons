//Напишите метод, который вернет содержимое текущей папки в виде массива строк.
//        Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
//        Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения,
//        оно должно записаться в лог-файл.

/* 
package seminar_two.task;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task7 {
    private static final Logger LOG = Log.log(Task7.class.getName());

    public static void write(String path) {

        try(FileWriter in = new FileWriter("Task7.txt")) {
            String[] data = getFilesInFolder(path);
            for (String datum : data) {
                in.append(datum);
            }
   //         LOG.log(Level.INFO,"Recorded! :)");
            throw new IOException("Error");
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
                        System.out.println("\tFile - " + name);
                    } else {
                        System.out.println("Directory - " + name);
                    }
                    result[i] = name;


                }
            }

        } else {
            System.out.println(dir.getName() + " not a directory");
        }

        return result;
    }

}

*/