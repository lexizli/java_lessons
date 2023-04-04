/*
 * 1) Написать метод, который принимает массив элементов, 
 * помещает их в стэк и выводит на консоль содержимое стэка.
 * 
 * 2) Написать метод, который принимает массив элементов, 
 * помещает их в очередь и выводит на консоль содержимое очереди. 
 */

package seminar_four.tasks;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Task3 {
    public static void run() {

        int[] wrkArray = {1,2,3,4,5,6,8,54,3,34};
        Stack<Integer> ourStack = new Stack<>();
        Queue<Integer> newQue = new LinkedList<>();
        Deque<Integer> newDeque = new LinkedList<>();
        

        for (int i = 0; i < wrkArray.length; i++) {
            ourStack.add(wrkArray[i]); // Метод из Vector
            newQue.add(wrkArray[i]);
            newDeque.push(wrkArray[i]);
       }



       System.out.println("Стек —> " + ourStack);
       System.out.println("Очередь —> " + newQue);
       System.out.println("Очередь задом наоборот —> " + newDeque);

    
}
}
