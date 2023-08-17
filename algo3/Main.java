// Реализовать метод разворота односвязного списка

package algo3;

import algo3.task.*;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("колбаса");
        list.add("тыква");

        System.out.println("Original list:");
        list.print();

        System.out.println("Убрать колбасу!");
        list.remove("колбаса");
        list.print();

        list.reverse();

        System.out.println("Разворачиваем");
        list.print();
    }
}