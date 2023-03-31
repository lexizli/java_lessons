package loggingTest;

import java.io.FileInputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.LogManager;



import seminar_two.task.Log;

public class Main {
    private static Logger LOGGER = (Logger) Log.log(Main.class.getName());


    static {
        try(FileInputStream ins = new FileInputStream("log.config")){  // полный путь до файла с конфигами
            LogManager.getLogManager().readConfiguration(ins);
        }catch (Exception ignore){
            ignore.printStackTrace();
        }
    }
    public static void main(String[] args) {
        try {
            LOGGER.log(Level.INFO,"Начало main, создаем лист с типизацией Integers");
            List<Integer> ints = new ArrayList<Integer>();
            LOGGER.log(Level.INFO,"присваиваем лист Integers листу без типипзации");
            LOGGER.log(Level.INFO,"присваиваем лист без типипзации листу строк");
            List<String> empty = ints;
            List<String> string = empty;
            
            LOGGER.log(Level.WARNING,"добавляем строку \"бла бла\" в наш переприсвоенный лист, возможна ошибка");
            string.add("бла 34");
            LOGGER.log(Level.WARNING,"добавляем строку \"бла 23\" в наш переприсвоенный лист, возможна ошибка");
            string.add("бла 23");
            LOGGER.log(Level.WARNING,"добавляем строку \"бла 34\" в наш переприсвоенный лист, возможна ошибка");
            string.add("бла 34");


            LOGGER.log(Level.INFO,"выводим все элементы листа с типизацией Integers в консоль");
            for (Object anInt : ints) {
                System.out.println(anInt);
            }

            LOGGER.log(Level.INFO,"Размер равен " + ints.size());
            LOGGER.log(Level.INFO,"Получим первый элемент");
            Integer integer = ints.get(0);
            LOGGER.log(Level.INFO,"выведем его в консоль");
            System.out.println(integer);

        }catch (Exception e){
            LOGGER.log(Level.WARNING,"что-то пошло не так" );
        }
    }
}


