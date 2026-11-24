package m2.l6;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class Main3 {
    static void main() {
        final int[] sum = {0};

        final IntSummaryStatistics intSummaryStatistics = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .mapToInt(i -> i)
                .summaryStatistics();

        System.out.println("Count: " + intSummaryStatistics.getCount());
        System.out.println("Sum: " + intSummaryStatistics.getSum());
        System.out.println("Min: " + intSummaryStatistics.getMin());
        System.out.println("Max: " + intSummaryStatistics.getMax());
        System.out.println("Average: " + intSummaryStatistics.getAverage());


        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .mapToInt(i -> i)
                .limit(5)
                .boxed()
                .forEach(System.out::println);
    }
}
