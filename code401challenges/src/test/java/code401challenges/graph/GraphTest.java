package code401challenges.graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class GraphTest {
    @Test
    public void addNodesTest() {
        Vertex vertex1 = new Vertex(1);
        Vertex vertex2 = new Vertex(2);
        Vertex vertex3 = new Vertex(3);
        Vertex vertex4 = new Vertex(4);
        Vertex vertex5 = new Vertex(5);

        Graph newGraph = new Graph();

        newGraph.addNode(vertex1);
        newGraph.addNode(vertex2);
        newGraph.addNode(vertex3);
        newGraph.addNode(vertex4);
        newGraph.addNode(vertex5);

        newGraph.addEdge(vertex1, vertex2, 1);
        newGraph.addEdge(vertex2, vertex3, 2);

        assertEquals(" Vertex --> 1 Edge: 2 Weight: 1\n" +
                " Vertex --> 2 Edge: 1 Weight: 1\n" +
                " Edge: 3 Weight: 2\n" +
                " Vertex --> 3 Edge: 2 Weight: 2\n" +
                " Vertex --> 4 Vertex --> 5", newGraph.printGraph());
        assertEquals(5, newGraph.getSize());
    }

    @Test public void addEdgesTest() {
        Vertex vertex1 = new Vertex(1);
        Vertex vertex2 = new Vertex(2);
        Vertex vertex3 = new Vertex(3);
        Vertex vertex4 = new Vertex(4);
        Vertex vertex5 = new Vertex(5);

        Graph newGraph = new Graph();

        newGraph.addNode(vertex1);
        newGraph.addNode(vertex2);
        newGraph.addNode(vertex3);
        newGraph.addNode(vertex4);
        newGraph.addNode(vertex5);

        newGraph.addEdge(vertex1, vertex2, 1);
        newGraph.addEdge(vertex2, vertex3, 2);
        newGraph.addEdge(vertex3, vertex4, 3);
        newGraph.addEdge(vertex4, vertex5, 4);
        newGraph.addEdge(vertex1, vertex5, 5);

        assertEquals(" Vertex --> 1 Edge: 2 Weight: 1\n" +
                " Edge: 5 Weight: 5\n" +
                " Vertex --> 2 Edge: 1 Weight: 1\n" +
                " Edge: 3 Weight: 2\n" +
                " Vertex --> 3 Edge: 2 Weight: 2\n" +
                " Edge: 4 Weight: 3\n" +
                " Vertex --> 4 Edge: 3 Weight: 3\n" +
                " Edge: 5 Weight: 4\n" +
                " Vertex --> 5 Edge: 4 Weight: 4\n" +
                " Edge: 1 Weight: 5\n", newGraph.printGraph());

        assertEquals(5, newGraph.getSize());
    }

}
