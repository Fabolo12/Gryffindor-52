package m1.l15;

public class Main {
    static void main() {
        Integer a = 100;  // -128 to 127
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;

        Integer sum = a + b; // Integer.valueOf(a.intValue() + b.intValue());

        System.out.println(4 == a.intValue());

        System.out.println("Equals a & b:" + a.equals(b));
        System.out.println("== a & b:" + (a == b));
        System.out.println("Equals c & d:" + c.equals(d));
        System.out.println("== c & d:" + (c == d));

        Integer userInput = null;
        Integer systemInput = 0;
        System.out.println(systemInput.equals(userInput));

        Integer sumOfLoop = 0;
        for (int i = 0; i < 1000; i++) {
            sumOfLoop = sumOfLoop + i;
        }
        System.out.println("Sum: " + sumOfLoop.intValue());

        print(100);
        print(Integer.valueOf(100));

        String age = "25";
        Integer ageInt = Integer.valueOf(age);
        System.out.println("Age: " + ageInt);
    }

    private static void print(final Integer sum) {
        System.out.println("Sum: " + sum);
    }

    private static void print(final int sum) {
        System.out.println("Sum: " + sum);
    }
}
