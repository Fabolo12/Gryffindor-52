package m1.l15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main3 {
    static void main() {
        List<String> list = new ArrayList<>();
        System.out.println(list.isEmpty());
        list.add("Hello");
        list.add("World");
        list.add("Hello");
//        System.out.println(list.size());

        for (int i = 0; i < 3; i++) {
            list.add("Hello");
        }

        /*print(list);

        final Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            final String s = iterator.next();
            System.out.println(s);
        }

        final ListIterator<String> stringListIterator = list.listIterator();
        while (stringListIterator.hasNext()) {
            final String s = stringListIterator.next();
            System.out.println(s);
        }

        while (stringListIterator.hasPrevious()) {
            final String s = stringListIterator.previous();
            System.out.println(s);
        }*/

        System.out.println(list.size());
        final String remove = list.remove(100);
        System.out.println("Removed: " + remove);
        System.out.println(list.size());

        /*for (String s : list) {
            if (s.equals("World")) {
                list.remove(s);
            }
        }*/

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        for (int number : numbers) {

        }

    }

    private static void print(List<String> list) {
        System.out.println(list);

        for (int i = 0; i < list.size(); i += 2) {
            final String s = list.get(i);
            System.out.println(s);
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
