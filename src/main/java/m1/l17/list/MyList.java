package m1.l17.list;

import java.util.Iterator;

public interface MyList<T> {
    void add(T item);

    T get(int index);

    int size();

    boolean contains(T item);

    Iterator<T> iterator();

    void addFirst(T item);
}
