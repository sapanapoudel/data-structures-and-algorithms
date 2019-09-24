package code401challenges.graph;

import org.junit.Test;

public class GraphTest {
    @Test
    public void createGraphTest() {
        Graph<String> newGraph = new Graph();
        newGraph.addNode("Tom");
        newGraph.addNode("Sam");

        newGraph.addEdge("Tom", "sam", 1);
        System.out.println(newGraph.getNodes());
    }


    @Test
    public void createGraphTest_WithDuplicateKeys() {
        Graph<String> newGraph = new Graph();
        newGraph.addNode("Sam");
        newGraph.addNode("Sam");

        newGraph.addEdge("Sam", "sam", 1);
        System.out.println(newGraph.getNodes());
    }

    @Test
    public void getNeighborTest() {
        Graph<String> newGraph = new Graph();
        newGraph.addNode("Tom");
        newGraph.addNode("Sam");

        newGraph.addEdge("Tom", "sam", 1);
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


        newGraph.addEdge("Tom", "sam", 1);
        newGraph.addEdge("Tom", "Kim", 3);
        newGraph.addEdge("Sam", "Harry", 4);
        newGraph.addEdge("Harry", "Smith", 5);
        System.out.println(newGraph.getNodes());
    }


    @Test
    public void getSizeTest() {
        Graph<String> newGraph = new Graph();
        newGraph.addNode("Tom");
        newGraph.addNode("Sam");

        newGraph.addEdge("Tom", "sam", 1);
        System.out.println(newGraph.getSize());
        System.out.println(newGraph.getNeighbor("Tom"));
    }



}