package modul9;

import java.util.Objects;

public class MyLinkedList<T> implements List<T> {
    private static class Node<T> {
        public Node(Node<T> next) {
            this.next = next;
        }

        Node<T> next;
        Node<T> prev;

        T element;

        public Node(T element) {

            this.element = element;
        }

    }

    private int size;
    private Node<T> head;
    private Node<T> tail;

    private Node<T> getCurrentByIndex(int index) {
        Node<T> current = head;
        for (int i = 1; i <= index; i++) {

            current = current.next;
        }
        return current;

    }

    @Override
    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (head == null) {
            head = tail = newNode;
        } else if (size == 1) {
            tail = newNode;
            head.next = newNode;
            newNode.prev = head;
        } else {
            Node<T> bufNod = tail;
            tail = newNode;
            tail.prev = bufNod;
            bufNod.next = tail;
        }
        size++;
    }

    @Override
    public T remove(int index) {
        Objects.checkIndex(index, size);
        T remItem;
        if (index == 0) {
            remItem = head.element;
            head = head.next;
            head.prev = null;
            if (head == null) {
                tail = null;
            }
        } else {
            Node<T> prevOfDelete = getCurrentByIndex(index - 1);
            remItem = prevOfDelete.next.element;
            prevOfDelete = prevOfDelete.next.next;
            prevOfDelete = prevOfDelete.prev.prev;
            if (index == size - 1) {
                tail = prevOfDelete;
            }
        }

        size--;
        return remItem;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public T get(int index) {
        Objects.checkIndex(index, size);
        return getCurrentByIndex(index).element;

    }

    public void ShouListForward() {
        var buffer = head;
        while (buffer != null) {
            System.out.println(buffer.element);
            buffer = buffer.next;
        }
    }

    public void ShouListBackward() {
        var buffer = tail;
        do {
            System.out.println(buffer.element);
            buffer = buffer.prev;

        } while (buffer != null);
    }
}


