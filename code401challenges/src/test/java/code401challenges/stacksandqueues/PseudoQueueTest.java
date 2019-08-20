package code401challenges.stacksandqueues;

import org.junit.Test;


import static org.junit.Assert.*;

public class PseudoQueueTest {
    @Test
    public void enqueueTest(){
        PseudoQueue<Integer> pseudoQueue = new PseudoQueue<>();
        pseudoQueue.enqueue(1);
        pseudoQueue.enqueue(2);
        pseudoQueue.enqueue(3);
        assertEquals("Should be same", "TOP--> 3--> 2--> 1--> null", pseudoQueue.stack1.toString());
    }

    @Test
    public void enqueueTest_inEmpty() {
        PseudoQueue<Integer> pseudoQueue = new PseudoQueue<>();
        pseudoQueue.enqueue(1);
        assertEquals("Should be same", "TOP--> 1--> null", pseudoQueue.stack1.toString());
    }

    @Test
    public void dequeueTest() {
        PseudoQueue<Integer> pseudoQueue = new PseudoQueue<>();
        pseudoQueue.enqueue(1);
        pseudoQueue.enqueue(2);
        int result = pseudoQueue.dequeue().getValue();
        assertEquals("Should be same", 1, result);
    }

}