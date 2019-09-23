package code401challenges.graph;

public class Vertex<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Vertex(T value) {
        this.value = value;
    }

}
