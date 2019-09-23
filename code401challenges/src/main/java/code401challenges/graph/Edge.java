package code401challenges.graph;

public class Edge<T> {
    private int weight;
    private T destination;

    public Edge(int weight, T destination) {
        this.weight = weight;
        this.destination = destination;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public T getDestination() {
        return destination;
    }

    public void setDestination(T destination) {
        this.destination = destination;
    }
}
