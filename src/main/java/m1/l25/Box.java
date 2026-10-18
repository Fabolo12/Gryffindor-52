package m1.l25;

import java.io.Serializable;

public class Box implements Serializable {
    private static Box box;

    private static final long serialVersionUID = 1L;

    private int size = 10;

    private String color = "red";

    private transient int weight;

    private Box(final int weight) {
        this.weight = weight;
    }

    public static Box createBox(final int weight) {
        if (box == null) {
            if (weight < 0) {
                box = new Box(20);
            }
            box = new Box(weight);
        }

        return box;
    }

    @Override
    public String toString() {
        return "Box{" +
                "size=" + size +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
