package m1.l18;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

public class Main {
    static void main() {
        final Map<Point, String> map = new HashMap<>();
        final Point point1 = new Point(0, 0);
        final Point point2 = new Point(1, 1);

        map.put(point1, "Origin");
        map.put(point2, "Point 1");

        final Set<Point> points = map.keySet();
        System.out.println("Points in the map: " + points);
        final Collection<String> values = map.values();
        System.out.println("Values in the map: " + values);
        final Set<Map.Entry<Point, String>> entries = map.entrySet();
        System.out.println("Entries in the map: " + entries);

        final String value = map.get(point1);
        System.out.println("Value for point1: " + value);

        System.out.println("Hash code for point1: " + point1.hashCode());
        point1.x = 10;
        System.out.println("Hash code for point1: " + point1.hashCode());
        final String value2 = map.get(point1);
        System.out.println("Value for point1: " + value2);
        point1.x = 0;
        System.out.println("Hash code for point1: " + point1.hashCode());
        final String value3 = map.get(point1);
        System.out.println("Value for point1: " + value3);

        final String key = UUID.randomUUID().toString();
        System.out.println("Key: " + key);
    }

    static class Point {
        String key;

        int x;

        int y;

        public Point(final int x, final int y) {
            this.key = UUID.randomUUID().toString();
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(final Object o) {
            System.out.println("equals called for Point{" + "x=" + x + ", y=" + y + '}');
            if (o == null || getClass() != o.getClass()) return false;
            final Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}
