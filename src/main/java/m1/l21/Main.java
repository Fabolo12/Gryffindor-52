package m1.l21;

public class Main {
    static void main() {
        System.out.println("Before method1");
        method1();
        System.out.println("After method1");
    }

    private static void method1() {
        try {
            System.out.println("Before method2");
            method2(10, 100);
            System.out.println("After method2");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Show exception message: " + e.getMessage());
            throw e;
        } catch (RuntimeException _) {
            System.out.println("ERROR");
        } finally {
            System.out.println("Finally block executed");
        }
    }


    private static void method2(int c, int b) {
        System.out.println("Before division by zero");

        if (b == 10) {
            throw new ArithmeticException("Division by 10 is not allowed");
        }

//        int a = c / b;
        int[] numbers = {1, 2, 3};
        numbers[10] = 5;
//        Integer a = null;
//        a.toString();

        System.out.println("After division by zero");
    }
}
