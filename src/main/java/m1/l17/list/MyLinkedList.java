package m1.l17.list;

import java.util.Iterator;

public class MyLinkedList<T> {

    private MyNode head;

    private MyNode tail;

    private int size;

    public void add(T item) {
        MyNode newNode = new MyNode(item);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        MyNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    public boolean contains(T item) {
        MyNode current = head;
        while (current != null) {
            if (current.value.equals(item)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private MyNode current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T value = current.value;
                current = current.next;
                return value;
            }
        };
    }

    public void addFirst(T item) {
        MyNode newNode = new MyNode(item);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        if (head == null) {
            return "[]";
        }

        MyNode current = head;
        do {
            sb.append(current.value);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        } while (current != null);

        return "[" + sb + "]";
    }

    class MyNode {
        private T value;

        private MyNode next;

        private MyNode prev;

        MyNode(T value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }
}
