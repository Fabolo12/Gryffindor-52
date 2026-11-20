package m2.l4;

public class Box<O> {
    private Object value;

    private O value2;

    public Box(final O value2) {
        this.value2 = value2;
    }

    public <I> I getValue() {
        return (I) value;
    }

    public <K> void setValue(final K value) {
        this.value = value;
    }
}
