package m1.l15;

public class Main2 {
    static void main() {
//        Object value = new Integer(123);
        Object value = "Hello World";
//        String str = (String) value;
//        Integer integer = (Integer) value;

        if (value instanceof String) {
            String str = (String) value;
            System.out.println("String: " + str);
        } else if (value instanceof Integer integer) {
            System.out.println("Integer: " + integer);
        }
    }
}
