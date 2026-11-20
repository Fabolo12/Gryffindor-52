package m2.l5;

@FunctionalInterface
public interface Maper<I, O> {
    O map(I input);

    default void method1() {
        System.out.println("method1");
    }

    default void method2() {
        System.out.println("method2");
    }

    static void method3() {
        System.out.println("method3");
    }

    static void method4() {
        System.out.println("method4");
    }

    @Override
    String toString();
}
