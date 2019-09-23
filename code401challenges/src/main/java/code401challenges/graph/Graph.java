package code401challenges.graph;

import java.util.Hashtable;
import java.util.List;

public class Graph<T> {
    public Hashtable<Vertex<T>, List<Edge<T>>> adjacencyList = new Hashtable<>();
    private int size = 0;

    public Graph(Hashtable<Vertex<T>, List<Edge<T>>> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }

    //Add node
//    public Vertex<T> addNode(T vertex) {
//        Vertex<T> node = new Vertex<T>(vertex);
//       adjacencyList.put(node, new List<Edge<T>>());
//
//    }
}
