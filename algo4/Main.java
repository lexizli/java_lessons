package algo4;

// В этом примере мы создаем объект 
// RedBlackTree<Integer>
//  и вставляем в него элементы от 1 до 21 с помощью метода 
// put
// . Затем мы выводим дерево с помощью метода 
// printInOrder
// , который рекурсивно выводит элементы дерева в порядке возрастания.

// Далее мы удаляем элемент 16 с помощью метода 
// remove
// , и выводим дерево снова.

// Наконец, мы получаем значение элемента 11 с помощью метода 
// get
//  и выводим его на экран.

// Тестируем красно-черное дерево.
public class Main {
    public static void main(String[] args) {
        RedBlackTree<Integer> tree = new RedBlackTree<>();

        // Вставляем данные — это будут нечетные значения. 
        for (int i = 1; i <= 21; i = i + 2) {
            tree.put(i);
        }

        // Выводим дерево.
        System.out.println("Дерево деревянное красно-чёрное:");
        tree.printInOrder(tree.root);
        System.out.println();

        // Добавляем куда-то 14.
        tree.put(14);

        // Удаляем 11.
        tree.remove(11);
        

        // Снова показываем дерево.
        System.out.println("Добавили 14 и удалили 11:");
        tree.printInOrder(tree.root);
        System.out.println();

        // Смотрим, что там за элемент 14
        System.out.println("Значение элемента 14: " + tree.get(14));
    }
}
