package m2.l5;

public class Main2 {
    static void main() {
        final int a = 10;

        Maper<Integer, String> maper = input -> {
            if (input == null) {
                return String.valueOf(a);
            }

            return String.valueOf(input);
        };

        System.out.println(maper.map(123));
        System.out.println(maper.map(null));

        new Box2().put(maper, null);
    }
}


class Box2 {
    public void put(Maper<Integer, String> maper, Integer input) {
        System.out.println(maper.map(input));
    }
}