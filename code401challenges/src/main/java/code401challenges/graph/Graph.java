package code401challenges.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

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
    public void addEdge(T value, T destination, int weight) {
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
    public ArrayList<Edge<T>> getNeighbor(T value) {
      ArrayList<Edge<T>> neighborList = vertices.get(value);
      return neighborList;

    }

    //Get Size
    public int getSize() {
      return size;
    }

    //Implement a breadth-first traversal on a graph.

}
