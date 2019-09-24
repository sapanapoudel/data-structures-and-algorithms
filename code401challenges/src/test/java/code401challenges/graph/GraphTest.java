package code401challenges.graph;

import org.junit.Test;

public class GraphTest {
    @Test
    public void createGraphTest() {
        Graph<String> newGraph = new Graph();
        newGraph.addNode("Tom");
        newGraph.addNode("Sam");

        newGraph.addEdge("Tom", new Vertex<>("Sam"), 1);
        System.out.println(newGraph.getNodes());
    }


    @Test
    public void createGraphTest_WithDuplicateKeys() {
        Graph<String> newGraph = new Graph();
        newGraph.addNode("Sam");
        newGraph.addNode("Sam");

        newGraph.addEdge("Sam", new Vertex<>("Sam"), 1);
        System.out.println(newGraph.getNodes());
    }

    @Test
    public void getNeighborTest() {
        Graph<String> newGraph = new Graph();
        newGraph.addNode("Tom");
        newGraph.addNode("Sam");

        newGraph.addEdge("Tom", new Vertex<>("Sam"), 1);
        System.out.println(newGraph.getNodes());
    }

    @Test
    public void createBiggerGraphTest() {
        Graph<String> newGraph = new Graph();
        newGraph.addNode("Tom");
        newGraph.addNode("Sam");
        newGraph.addNode("Harry");
        newGraph.addNode("Kim");
        newGraph.addNode("Smith");


        newGraph.addEdge("Tom",  new Vertex<>("Sam"), 1);
        newGraph.addEdge("Tom", new Vertex<>("Harry"), 3);
        newGraph.addEdge("Sam", new Vertex<>("Kim"), 4);
        newGraph.addEdge("Harry", new Vertex<>("Kim"), 5);

        System.out.println(newGraph.getNodes());
    }


    @Test
    public void getSizeTest() {
        Graph<String> newGraph = new Graph();
        newGraph.addNode("Tom");
        newGraph.addNode("Sam");

        newGraph.addEdge("Tom", new Vertex<>("Sam"), 1);
        System.out.println(newGraph.getSize());
        System.out.println(newGraph.getNeighbor("Tom"));
    }

    //Test breadth-first traversal for graph
    @Test public void breadth_firstTest() {
        Graph<String> newGraph = new Graph();
        Vertex vertex1 = new Vertex("Tom");
        Vertex vertex2 = new Vertex("Sam");
        Vertex vertex3 = new Vertex("Harry");
        Vertex vertex4 = new Vertex("Kim");
        Vertex vertex5 = new Vertex("Smith");

        newGraph.addNode((String) vertex1.getValue());
        newGraph.addNode((String) vertex2.getValue());
        newGraph.addNode((String) vertex3.getValue());
        newGraph.addNode((String) vertex4.getValue());
        newGraph.addNode((String) vertex5.getValue());


        newGraph.addEdge((String) vertex1.getValue(), vertex2, 2);
        newGraph.addEdge("Sam", new Vertex<>("Kim"), 3);
        newGraph.addEdge("Sam", new Vertex<>("Tom"), 4);
        newGraph.addEdge("Kim", new Vertex<>("Harry"), 4);
        newGraph.addEdge("Kim", new Vertex<>("Smith"), 5);
        newGraph.addEdge("Harry", new Vertex<>("Tom"), 6);
        newGraph.addEdge("Harry", new Vertex<>("Kim"), 7);;

        System.out.println(newGraph.breathFirstGraphTraversal(new Vertex<>("Tom")));


    }



}