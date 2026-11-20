package m2.l4;

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(final K key, final V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(final K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(final V value) {
        this.value = value;
    }
}

class StringPair<V> extends Pair<String, V> {
    public StringPair(final String key, final V value) {
        super(key, value);
    }
}

class StringIntegerPair extends Pair<String, Integer> {
    public StringIntegerPair(final String key, final Integer value) {
        super(key, value);
    }
}

class Trio<K, V, D> extends Pair<K, V> {
    private D delta;

    public Trio(final K key, final V value, final D delta) {
        super(key, value);
        this.delta = delta;
    }
}
