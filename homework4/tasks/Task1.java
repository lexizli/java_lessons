/*
 * Пусть дан LinkedList с несколькими элементами. 
 * Реализуйте метод, который вернёет «перевёрнутый» список.
 */

package homework4.tasks;

import java.util.LinkedList;

public class Task1 {
    public static void run() {

        LinkedList<String> forReverce = new LinkedList<>();

        forReverce.push("She ");
        forReverce.push("sells ");
        forReverce.push("seashells ");
        forReverce.push("on ");
        forReverce.push("the ");
        forReverce.push("seashore...");      

        System.out.println(forReverce.toString());
        System.out.println(reverseLinkedList(forReverce).toString());         
        
    }

	public static LinkedList<String> reverseLinkedList(LinkedList<String> linlist)
	{
		LinkedList<String> revLinkedList = new LinkedList<String>();
		for (int i = linlist.size() - 1; i >= 0; i--) {

			revLinkedList.add(linlist.get(i));
		}
		return revLinkedList;
	}
    
}




