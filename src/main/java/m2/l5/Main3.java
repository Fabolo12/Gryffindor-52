package m2.l5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Main3 {

    private static int staticCount = 0;

    static void main() {
//       final int count = 0;
        final int[] count = {0};
        final List<Integer> list = new ArrayList<>();
        list.add(0);
        final AtomicInteger atomicCount = new AtomicInteger(0);

        for (int i = 0; i < 10; i++) {
            final Runnable runnable1 = () -> count[0] += count();
            final Runnable runnable2 = () -> list.set(0, list.get(0) + count());
            final Runnable runnable3 = () -> atomicCount.addAndGet(count());
            final Runnable runnable4 = () -> staticCount++;
            runnable1.run();
            runnable2.run();
            runnable3.run();
            runnable4.run();
        }

        System.out.println(count[0]);
        System.out.println(list);
        System.out.println(atomicCount);
        System.out.println(staticCount);

        final List<Integer> integers = List.of(1, 2, 3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        int index = 0;
        while (index < list.size()) {
            System.out.println(list.get(index));
            index++;
        }

        int doIndex = 0;
        do {
            System.out.println(list.get(doIndex));
            doIndex++;
        } while (doIndex < list.size());

        for (Integer integer : integers) {
            System.out.println(integer);
        }

        integers.forEach(integer -> System.out.println("*" + integer + "*"));

        integers.forEach(System.out::println);
    }

    private static int count() {
        return 1;
    }
}
