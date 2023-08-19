package modul9;

import java.util.Objects;
import java.util.Queue;

public class MyQueue<T> {
    private static class Node<T> {
        T element;

        public Node(T element) {
            this.element = element;
        }

        Node<T> next;
    }

    private int size;
    private Node<T> first;
    private Node<T> last;

    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (first == null) {
            first = last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public T peek() {
        return first.element;
    }

    public T pool() {
        T firstItem = first.element;
        first = first.next;
        size--;
        return firstItem;
    }

    public T get(int index) {
        Objects.checkIndex(index, size);
        Node<T> current = first;
        for (int i = 1; i <= index; i++) {
            current = current.next;
        }
        return current.element;

    }

}

