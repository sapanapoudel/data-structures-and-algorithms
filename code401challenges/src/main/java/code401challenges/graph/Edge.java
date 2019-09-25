package code401challenges.graph;

public class Edge<T> {
    private int weight;
    private Vertex <T> destination;

    public Edge(int weight, Vertex destination) {
        this.weight = weight;
        this.destination = destination;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Vertex<T> getDestination() {
        return destination;
    }

    public void setDestination(Vertex<T> destination) {
        this.destination = destination;
    }
}
