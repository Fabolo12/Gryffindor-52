package m1.l20;

public class Main2 {

    static void main() {
        final String colorText = "red";

        final Color color = Color.valueOf(colorText.toUpperCase());
        final Box box = new Box(color);
        System.out.println(box);
    }

    static class Box {
        Color color;

        public Box(final Color color) {
            this.color = color;
        }
    }

    enum Color {
        RED, GREEN, BLUE
    }
}
