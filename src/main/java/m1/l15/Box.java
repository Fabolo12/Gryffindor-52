package m1.l15;

public class Box<E, T> {
    private int width;
    private int height;
    private E value;
    private T anotherValue;

    public Box(final E value) {
        this.value = value;
    }

    public E getValue() {
        return value;
    }

    public void setValue(final E value) {
        this.value = value;
    }

    public void doubleValue() {
        width = width * 2;
        height = height * 2;
    }
}
