package modul9;

import java.util.Arrays;
import java.util.Objects;

class MyArrayList<T> implements List<T> {

    public static final int DEFAULT_CAPACITY = 5;
    private Object[] elements;

    private int size;

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;

    }

    @Override
    public void add(T element) {
        if (size <= elements.length) {
            elements[size++] = element;
        }
        if (size >= elements.length) {
            Object[] newArray = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newArray, 0, size);
            elements = newArray;
        }
    }


    @Override
    public T remove(int index) {
        T remElements = (T) elements[index];
        Objects.checkIndex(index, size);
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
        return remElements;
    }

    @Override
    public int size() {

        return size;
    }

    @Override
    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public T get(int index) {
        Objects.checkIndex(index, size);
        return (T) elements[index];
    }
}

