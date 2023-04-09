/*
//  Реализуйте очередь с помощью LinkedList со следующими методами:
//      • enqueue() — помещает элемент в конец очереди,
//      • dequeue() — возвращает первый элемент из очереди и удаляет его,
//      • first() — возвращает первый элемент из очереди, не удаляя.
 */

package homework4.tasks;

import java.util.LinkedList;

public class Task2 {

    public static LinkedList<String> forQueue = new LinkedList<>();

    public static void run() {    

        forQueue.add("She ");
        forQueue.add("sells ");
        forQueue.add("seashells ");
        forQueue.add("by ");
        forQueue.add("the ");
        forQueue.add("seashore...");     
        
        System.out.println(forQueue.toString());

        enqueue("The shells she sells are seashells");

        // String testString = new String();
        // testString = forQueue.toString();
        // System.out.println(testString.split(","));
        // Arrays.toString(arrSymmDiff) + "\n");

        System.out.println(forQueue.toString().replace(",", "\n"));

        String dequed = new String();
        dequed = dequeue();

        System.out.println(dequed);
        System.out.println(forQueue.toString());

        String first = new String();
        first = first();

        System.out.println(first);
        System.out.println(forQueue.toString());
    }

    // enqueue() — помещает элемент в конец очереди
    public static void enqueue(String string) {
        forQueue.add(forQueue.size(), string);
    }

    // dequeue() — возвращает первый элемент из очереди и удаляет его
    public static String dequeue() {

        return forQueue.removeFirst();

    }

    // first() — возвращает первый элемент из очереди, не удаляя
    public static String first() {

        return forQueue.getFirst();

    }

    
}

