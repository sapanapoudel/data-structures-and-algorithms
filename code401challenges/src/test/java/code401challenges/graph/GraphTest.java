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
}