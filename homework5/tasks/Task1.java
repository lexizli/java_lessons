// Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что 1 человек может иметь несколько телефонов.

package homework5.tasks;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static Map<String, String> phoneBook = new HashMap<>();
    public static final String PHONE_TEMPLATE = "[+7][\\d]{11}";

    public static void run() {

        addPhone("+70000000001", "Vasja Pupkin");
        addPhone("+71111111110", "Vasja Pupkin");
        addPhone("+72222222221", "Vasja Pupkin");
        addPhone("+71237896655", "Stupid Duck");
        addPhone("+72000002221", "Spacy Pig");
        addPhone("+72222222221", "Vasja Pupkin");
        addPhone("81234567890", "Nepupkin Basja");
        addPhone("+74444444440", "Vasja Pupkin");
        addPhone("+71231231213", "Dana Pumpkins");

        // System.out.println(phoneBook); //
        // // System.out.println(phoneBook.containsValue("один"));
        // // System.out.println(phoneBook.containsValue("Vasja Pupkin"));
        // System.out.println(phoneBook.keySet());
        // System.out.println(phoneBook.values());
        // // System.out.println(phoneBook.values());

        System.out.println("\nSort by name");
        phoneBook.entrySet().stream().sorted(Map.Entry.<String, String>comparingByValue()).forEach((kv -> {
            System.out.printf("%s \t — > %s\n", kv.getKey(), kv.getValue());
        }));
        System.out.println("\nSort by name in reverce order");
        phoneBook.entrySet().stream().sorted(Map.Entry.<String, String>comparingByValue().reversed()).forEach((kv -> {
            System.out.printf("%s \t — > %s\n", kv.getKey(), kv.getValue());
        }));
        System.out.println("\nSort by phone");
        phoneBook.entrySet().stream().sorted(Map.Entry.<String, String>comparingByKey()).forEach((kv -> {
            System.out.printf("%s \t — > %s\n", kv.getKey(), kv.getValue());
        }));
        System.out.println("\nSort by phone in reverce order");
        phoneBook.entrySet().stream().sorted(Map.Entry.<String, String>comparingByKey().reversed()).forEach((kv -> {
            System.out.printf("%s \t — > %s\n", kv.getKey(), kv.getValue());
        }));

    }

    public static boolean addPhone(String phone, String name) {
        if (testPhoneNumber(phone)) {
            phoneBook.put(phone, name);
            return true;
        }
        return false;
    }

    public static boolean testPhoneNumber(String phone) {
        if (!phone.matches(PHONE_TEMPLATE)) {
            return false;
        }
        return true;
    }

}
