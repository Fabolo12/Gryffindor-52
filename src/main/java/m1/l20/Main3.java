package m1.l20;

public class Main3 {

    static void main() {
        final Box box1 = Box.getInstance();
        final Box box2 = Box.getInstance();

        System.out.println(box1 == box2);
    }
}

class Box {

    private static Box instance;

    private Box() {

    }

    public static Box getInstance() {
        if (instance == null) {
            System.out.println("Creating a new instance of Box");
            instance = new Box();
        }
        System.out.println("Returning the existing instance of Box");
        return instance;
    }
}