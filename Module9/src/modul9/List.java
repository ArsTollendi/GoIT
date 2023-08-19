package modul9;

public interface List<T> {
    void add(T element);
    T remove(int index);
    int size();
    void clear();
    T get(int index);
}
