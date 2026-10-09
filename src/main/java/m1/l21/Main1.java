package m1.l21;

public class Main1 {
    static void main() {
        method();
    }

    private static void method() {
        checkedException();
    }

    private static void uncheckedException() {
        throw new RuntimeException("Unchecked exception");
    }

    private static void checkedException() {
        try {
            throw new Exception("Checked exception");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
