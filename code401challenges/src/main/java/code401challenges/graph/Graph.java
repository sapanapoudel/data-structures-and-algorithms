package code401challenges.graph;
import code401challenges.stacksandqueues.Queue;

import java.util.*;

public class Graph<T> {

  private LinkedHashMap<Vertex,  ArrayList<Edge>> adjList;
  private int size = 0;

  public Graph(){
      this.adjList = new LinkedHashMap<>();
  }

    //Get nodes
    public ArrayList<Vertex> getNodes() {
      ArrayList<Vertex> nodes = new ArrayList<>();
      for(Map.Entry<Vertex, ArrayList<Edge>> entry : adjList.entrySet()) {
          nodes.add(entry.getKey());
      }
      return nodes;
    }

    // Add node
    public void addNode(Vertex node) {
        if(!adjList.containsKey(node)) {
            adjList.put(node, new ArrayList<>());
            size++;
        }
    }

    //Add edge
    public void addUndirectedEdge(Vertex start, Vertex destination, int weight) {
      ArrayList<Edge> newEdge = adjList.get(start);
      newEdge.add(new Edge(weight, destination));
      adjList.put(start, newEdge);
    }


    public void addEdge(Vertex start, Vertex destination, int weight) {
      addUndirectedEdge(start, destination, weight);
      addUndirectedEdge(destination, start, weight);
    }

    //Get neighbor
    public ArrayList<Edge> getNeighbor(Vertex node) {
      return adjList.get(node);
    }

    //Get Size
    public int getSize() {
      return size;
    }

    //Print
    public String printGraph() {
      StringBuilder printGraph = new StringBuilder();

        for(Map.Entry<Vertex, ArrayList<Edge>> entry : adjList.entrySet()) {
            printGraph.append(" Vertex --> " + entry.getKey().getValue());
            for(Edge edge : entry.getValue()){
                printGraph.append(" Edge: " + edge.getDestination().getValue() + " Weight: " + edge.getWeight() + "\n");
            }
        }
        return printGraph.toString();

    }

    //Implement breath-first traversal
//    public List breathFirstGraphTraversal(Vertex value) {
//      List graphNodes = new ArrayList();
//        Queue q = new Queue();
//        q.enqueue(value);
//
//        while(!q.isEmpty()){
//            Vertex vertex = (Vertex) q.dequeue();
//            vertex.visited = true;
//            graphNodes.add(vertex.getValue());
//
//            for(Edge edge : (ArrayList<Edge>)vertex.getNeightbor()) {
//                if(!edge.getDestination().visited){
//                    edge.getDestination().visited = true;
//                    q.enqueue(edge.getDestination());
//                }
//            }
//
//
//        }
//        return graphNodes;
//    }
}
