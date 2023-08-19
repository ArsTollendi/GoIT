package modul9;

import java.util.Objects;

public class MyStack<T> {
    private static class Node<T> {
        Node<T> next;
        T element;

        public Node(T element) {

            this.element = element;
        }
    }

    private int size;
    Node<T> first;
    Node<T> last;

    public void push(T element) {
        Node<T> newNode = new Node<>(element);
        if (first == null) {
            first = last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public T remove(int index) {
        Objects.checkIndex(index, size);
        T remItem;
        if (index == 0) {
            remItem = first.element;
            first = first.next;
        } else {
            Node<T> current = first;
            Node<T> prevElement = null;
            for (int i = 1; i <= index - 1; i++) {
                current = current.next;
                prevElement = current;
            }
            remItem = prevElement.next.element;
            prevElement = prevElement.next.next;
            if (index == size - 1) {
                last = prevElement;
            }
        }
        size--;
        return remItem;
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
        return last.element;
    }

    public T pool() {
        T lastItem = last.element;
        size--;
        return lastItem;
    }

    public T get(int index) {
        Objects.checkIndex(index, size);
        MyStack.Node<T> current = first;
        for (int i = 1; i <= index; i++) {
            current = current.next;
        }
        return current.element;

    }

}

