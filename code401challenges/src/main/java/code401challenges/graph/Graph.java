package code401challenges.graph;

import code401challenges.stacksandqueues.Queue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Graph<T> {
  private HashMap<T, ArrayList<Edge<T>>> vertices;
  private int size = 0;

  public Graph(){this.vertices = new HashMap<>();}

    public Graph(HashMap<T, ArrayList<Edge<T>>> vertices) {
        this.vertices = vertices;
    }

    //Get nodes
    public String getNodes() {
        return vertices.keySet().toString();
    }

    public void setVertices(HashMap<T, ArrayList<Edge<T>>> vertices) {
        this.vertices = vertices;
    }

    // Add node
    public void addNode(T node) {
        if(!vertices.containsKey(node)) {
            vertices.put(node, new ArrayList<Edge<T>>());
            size++;
        }
    }

    //Add edge
    public void addEdge(T value, Vertex<T> destination, int weight) {
        if(vertices.containsKey(value) && vertices.containsKey(destination)){
            ArrayList<Edge<T>> edgeList = vertices.get(value);
            Edge<T> newEdge = new Edge<>(weight, destination);
            boolean flag = false;
            for(int i = 0; i < edgeList.size(); i++) {
                if(newEdge.getDestination().equals(edgeList.get(i).getDestination())){
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                edgeList.add(newEdge);
                vertices.replace(value, edgeList);
            }

        }
    }

    //Get neighbor
    public ArrayList<Edge<T>> getNeighbor(T node) {
      ArrayList<Edge<T>> result = new ArrayList<>();
        if(vertices.containsKey(node)){
            return vertices.get(node);
        } else {
            return null;
        }
    }

    //Get Size
    public int getSize() {
      return size;
    }

    //Implement breath-first traversal
    public List breathFirstGraphTraversal(Vertex<T> value) {
      List graphNodes = new ArrayList();
        Queue q = new Queue();
        q.enqueue(value);

        while(!q.isEmpty()){
            Vertex vertex = (Vertex) q.dequeue();
            vertex.visited = true;
            graphNodes.add(vertex.getValue());

            for(Edge edge : (ArrayList<Edge>)vertex.getNeightbor()) {
                if(!edge.getDestination().visited){
                    edge.getDestination().visited = true;
                    q.enqueue(edge.getDestination());
                }
            }


        }
        return graphNodes;
    }
}
