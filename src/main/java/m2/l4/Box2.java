package m2.l4;

public class Box2<I> implements BoxCloseble<I, String> {
    private I value;

    public Box2(final I value) {
        this.value = value;
    }

    public I getValue() {
        return value;
    }

    public void setValue(final I value) {
        this.value = value;
    }

    @Override
    public void close(final I value) {

    }

    @Override
    public void close2(final String value) {

    }
}
