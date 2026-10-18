package m1.l25;

public class Main2 {
    static void main() {
        final String numberString = "twelve";
        if (isNumber(numberString)) {
            int number = Integer.parseInt(numberString);
            System.out.println(number);
        } else {
            System.out.println("Invalid number: " + numberString);
        }
    }

    private static boolean isNumber(final String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
