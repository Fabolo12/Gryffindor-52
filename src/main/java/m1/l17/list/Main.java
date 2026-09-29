package m1.l17.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    static void main() {
        System.out.println("Basic ArrayList:");
        final List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        System.out.println(list);
        final String word = list.get(0);
        System.out.println(word);
        final int size = list.size();
        System.out.println("Size of the list: " + size);
        final boolean contains = list.contains("Hello");
        System.out.println("List contains 'Hello': " + contains);
        final Iterator<String> iterator = list.iterator();
        System.out.println("Iterating over the list:" + iterator);
        System.out.println();

        System.out.println("MyArrayList:");
        final MyList<String> myList = new MyArrayList<>();
        myList.add("Hello");
        myList.add("World");
        System.out.println(myList);
        final String myWord = myList.get(0);
        System.out.println(myWord);
        final int mySize = myList.size();
        System.out.println("Size of my list: " + mySize);
        final boolean myContains = myList.contains("Hello");
        System.out.println("My list contains 'Hello': " + myContains);
        final Iterator<String> myIterator = myList.iterator();
        System.out.println("Iterating over my list:" + myIterator);
        System.out.println();

        System.out.println("MyLinkedList:");
        final MyList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("Hello");
        myLinkedList.add("World");
        System.out.println(myLinkedList);
        final String myLinkedWord = myLinkedList.get(0);
        System.out.println(myLinkedWord);
        final int myLinkedSize = myLinkedList.size();
        System.out.println("Size of my list: " + myLinkedSize);
        final boolean myLinkedContains = myLinkedList.contains("Hello");
        System.out.println("My list contains 'Hello': " + myLinkedContains);
        final Iterator<String> myLinkedIterator = myLinkedList.iterator();
        System.out.println("Iterating over my list:" + myLinkedIterator);
        while (myLinkedIterator.hasNext()) {
            System.out.println(myLinkedIterator.next());
        }
        myLinkedList.addFirst("First");
        System.out.println("After adding first: " + myLinkedList);

        final MyList myList1 = new MyList();

    }
}
