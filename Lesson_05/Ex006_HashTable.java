package Lesson_05;

import java.util.*;

public class Ex006_HashTable {
    public static void main(String[] args) {
        Map<Integer,String> table = new Hashtable<>();
        table.put(1, "два");
        System.out.println(table);
        table.put(11, "один двадцать один");
        System.out.println(table);
        table.put(2, "один");
        System.out.println(table);
        table.put(3, "три");
        System.out.println(table);
        table.put(17, "семнадцать");
        System.out.println(table);
        table.put(5, "пать");
        System.out.println(table);
        table.put(8, "восим");
        System.out.println(table);
        table.put(4, "чепыре");
        System.out.println(table); // {2=один, 1=два, 11=один один}
        // table.put(null, "один"); //  java.lang.NullPointerException
    }
}
