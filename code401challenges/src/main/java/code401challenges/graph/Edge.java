package code401challenges.graph;

public class Edge<T> {
    private int weight;
    private Vertex<T> vertex;

    public Edge(int weight, Vertex<T> vertex) {
        this.weight = weight;
        this.vertex = vertex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Vertex<T> getVertex() {
        return vertex;
    }

    public void setVertex(Vertex<T> vertex) {
        this.vertex = vertex;
    }
}
