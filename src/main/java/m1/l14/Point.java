package m1.l14;

public class Point {
    public static int x;

    public static String color;

    public static int count = 0;

    private static int y;

    static {
        System.out.println("Static initializer Point");
    }


    public Point(final int x) {
        this.x = x;
        count++;
    }

    public static void setX(final int x) {
        Point.x = x;
        count++;
    }

    public void setColor(final String color) {
        Point.color = color;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", color=" + color +
                '}';
    }

    class Line2 {
        public Line2() {
            System.out.println("Line2 created " + y);
        }
    }

    static class Line3 {
        public Line3() {
            System.out.println("Line3 created" + y);
        }
    }

    static class Line4 {
    }

    static class Line5 {
    }

    static class Line6 {
    }
}

class Line1 {
    public Line1() {
        System.out.println("Line1 created");
    }
}