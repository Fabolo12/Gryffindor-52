package m1.l15;

public class Main1 {
    static void main() {
        final Box<String, Integer> box1 = new Box<>("Hello World");
        final Box<Integer, Integer> box2 = new Box<>(123);

        final Object value1 = box1.getValue();
        final Object value2 = box2.getValue();
        final String value11 = box1.getValue();
        final Integer value22 = box2.getValue();

        System.out.println(value1);
        System.out.println(value2);

//        box1.setValue(123);

        final Box box4 = new Box(123);
    }
}
