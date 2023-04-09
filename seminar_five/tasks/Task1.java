package seminar_five.tasks;

import java.util.HashMap;

public class Task1 {

    public static void run() {
        HashMap<String,String> workers = new HashMap<>();
        workers.put("123456", "Иванов");
        workers.put("321456", "Васильев");
        workers.put("234561", "Петрова");
        workers.put("234432", "Иванов");
        workers.put("654321", "Петрова");
        workers.put("345678", "Иванов");
        for (HashMap.Entry<String,String> item : workers.entrySet()) {
            if (item.getValue() == "Иванов") {
                System.out.println(item.getKey() + item.getValue());
            }
        }
            
        }




    }

    
