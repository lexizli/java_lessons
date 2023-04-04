/*
 * Реализовать стэк с помощью массива. 
 * Нужно реализовать методы: 
 * size(), empty(), push(), peek(), pop(). 

 */
package seminar_four.tasks;

public class OurNewStack {

    private int[] array;

    private int capacity;

    private int top;

    public OurNewStack() {
        int size = 3;
        array = new int[size];
        capacity = size;
        top = -1;
    }

    private void addCapacity() {
        int[] copy = new int[array.length + array.length / 2];
        System.arraycopy(array, 0, copy, 0, array.length);
        array = copy;
        capacity = array.length;

    }

    public int getCapacity(){
        return capacity;
    }

    public int size() {
        return top+1;
    }

    public boolean empty() {
        return top == -1;
    }

    public OurNewStack push(int value) {
        if (isFull()) {
            addCapacity();
        }

        array[++top] = value;
        return this;

    }

    public int peek() {
        if (!empty()) {
            return array[top];
        } else throw new RuntimeException("Stack is empty"); 
        
    }

    public int pop() {
        if (empty()) {
            throw new RuntimeException("Stack is empty");
        } 
        peek();
        return array[top--];

    }

    private boolean isFull() {
        return size() == capacity;
    }

}
