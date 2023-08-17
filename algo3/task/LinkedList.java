package algo3.task;

public class LinkedList {
    Node head;

    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next!= null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void remove(String data) {
        if (head == null) {
            return;
        }
        if (head.data.equals(data)) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next!= null) {
            if (current.next.data.equals(data)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current!= null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    public void print() {
        Node current = head;
        while (current!= null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}