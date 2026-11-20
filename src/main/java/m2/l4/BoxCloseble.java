package m2.l4;

public interface BoxCloseble<N, K> {
    void close(N value);

    void close2(K value);
}
