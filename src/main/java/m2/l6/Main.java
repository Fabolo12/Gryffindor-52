package m2.l6;

import java.util.List;
import java.util.function.Predicate;

public class Main {

    private static final Predicate<Integer> IS_BIGGER_THREE = i -> i > 3;

    static void main() {
        final List<Integer> numbers = List.of(1, -2, 3, -4, 5, 6, -7, 8, 9, -10);
        final IntegerFilter integerFilter = new IntegerFilter();

        numbers.stream()
                .filter(i -> i > 0)
                .filter(IS_BIGGER_THREE)
                .filter(Main::isBiggerThanSix)
                .filter(integerFilter::isBiggerThanSix)
                .filter(i -> isBiggerThanSixty(i * 10))
                .map(i -> "*" + i + "*")
                .forEach(System.out::println);

        System.out.println(numbers);

    }

    private static boolean isBiggerThanSix(Integer i) {
        return i > 6;
    }

    private static boolean isBiggerThanSixty(Integer i) {
        return i > 60;
    }

    static class IntegerFilter {
        public boolean isBiggerThanSix(Integer i) {
            return i > 6;
        }
    }
}