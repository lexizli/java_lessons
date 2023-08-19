package algo4;

//  Реализация  алгоритма красно-черного дерева для вставки, удаления и поиска узлов в дереве.        

public class RedBlackTree<T extends Comparable<T>> {
    private static final boolean RED = false;
    private static final boolean BLACK = true;

    Node<T> root;

    // Класс Node — узел в дереве с ключом, цветом, размером и левым и правым
    // дочерними узлами.
    private static class Node<T> {
        private T key;
        private boolean color;
        private int size;
        private Node<T> left;
        private Node<T> right;

        public Node(T key, boolean color) {
            this.key = key;
            this.color = color;
            this.size = 1;
            this.left = null;
            this.right = null;
        }
    }

    // Вставляем новый узел, сохраняя свойства дерева.
    public void put(T key) {
        root = put(root, key);
        root.color = BLACK;
    }

    private Node<T> put(Node<T> node, T key) {
        if (node == null) {
            return new Node<>(key, RED);
        }

        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            node.left = put(node.left, key);
        } else if (cmp > 0) {
            node.right = put(node.right, key);
        } else {
            node.key = key;
        }

        if (isRed(node.right) && !isRed(node.left)) {
            node = rotateLeft(node);
        }
        if (isRed(node.left) && isRed(node.left.left)) {
            node = rotateRight(node);
        }
        if (isRed(node.left) && isRed(node.right)) {
            flipColors(node);
        }

        node.size = size(node.left) + size(node.right) + 1;
        return node;
    }

    // Ищем узел с заданным ключом, возвращая ключ, если он есть.
    public T get(T key) {
        Node<T> node = get(root, key);
        return node == null ? null : node.key;
    }

    private Node<T> get(Node<T> node, T key) {
        if (node == null) {
            return null;
        }

        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            return get(node.left, key);
        } else if (cmp > 0) {
            return get(node.right, key);
        } else {
            return node;
        }
    }

    // Удаляем узел с заданным ключом, если он есть.
    public void remove(T key) {
        root = remove(root, key);
        if (root != null) {
            root.color = BLACK;
        }
    }

    private Node<T> remove(Node<T> node, T key) {
        if (node == null) {
            return null;
        }

        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            node.left = remove(node.left, key);
        } else if (cmp > 0) {
            node.right = remove(node.right, key);
        } else {
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }

            Node<T> min = min(node.right);
            node.key = min.key;
            node.right = remove(node.right, min.key);
        }

        if (isRed(node.right) && !isRed(node.left)) {
            node = rotateLeft(node);
        }
        if (isRed(node.left) && isRed(node.left.left)) {
            node = rotateRight(node);
        }
        if (isRed(node.left) && isRed(node.right)) {
            flipColors(node);
        }

        node.size = size(node.left) + size(node.right) + 1;
        return node;
    }

    // Находим узел с минимальным ключом в поддереве.
    private Node<T> min(Node<T> node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    // Находим размер поддерева.
    private int size(Node<T> node) {
        return node == null ? 0 : node.size;
    }

    // Проверяем, красный ли узел.
    private boolean isRed(Node<T> node) {
        return node != null && node.color == RED;
    }

    // Делаем левый поворот.
    private Node<T> rotateLeft(Node<T> node) {
        Node<T> right = node.right;
        node.right = right.left;
        right.left = node;
        right.color = node.color;
        node.size = size(node.left) + size(node.right) + 1;
        right.size = size(right.left) + size(right.right) + 1;
        return right;
    }

    // Делаем правый поворот.
    private Node<T> rotateRight(Node<T> node) {
        Node<T> left = node.left;
        node.left = left.right;
        left.right = node;
        left.color = node.color;
        node.size = size(node.left) + size(node.right) + 1;
        left.size = size(left.left) + size(left.right) + 1;
        return left;
    }

    // Меняем цвет узлов.
    private void flipColors(Node<T> node) {
        node.color = RED;
        node.left.color = BLACK;
        node.right.color = BLACK;
    }

    // Выводим ключи на печать.
    public void printInOrder(Node<T> node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.print(node.key + " ");
            printInOrder(node.right);
        }
    }
}