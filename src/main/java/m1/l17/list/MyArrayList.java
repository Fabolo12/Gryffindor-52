package m1.l17.list;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<T> {
    private T[] array;

    private int size;

    public MyArrayList() {
        array = (T[]) new Object[10];
        size = 0;
    }

    public MyArrayList(final int size) {
        array = (T[]) new Object[size];
        this.size = 0;
    }

    public void add(T item) {
        if (size == array.length) {
            resize();
        }
        array[size++] = item;
    }

    private void resize() {
        System.out.println("Resizing array from " + array.length + " to " + (array.length * 2 + 1));
        T[] newArray = (T[]) new Object[array.length * 2 + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return array[index];
    }

    public int size() {
        return size;
    }

    public boolean contains(T item) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public T next() {
                return array[currentIndex++];
            }
        };
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(array, size));
    }
}
