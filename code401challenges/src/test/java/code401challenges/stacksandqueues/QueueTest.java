package code401challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    //successfully enqueue into a queue
    @Test public void queueTest_initiateEmptyQueue() {
        Queue<Integer> newQueue  = new Queue<>(null, null);
        newQueue.enqueue(2);
        assertEquals("Should be equal", "Front--> 2 <--Rear", newQueue.toString());
    }

    //successfully enqueue multiple values into a queue
    @Test public void queueTest_enqueueMultipleValues() {
        Queue<Integer> newQueue  = new Queue<>(null, null);
        newQueue.enqueue(2);
        newQueue.enqueue(1);
        assertEquals("Should be equal", "Front--> 2--> 1 <--Rear", newQueue.toString());
    }

    //successfully dequeue out of a queue the expected value
    @Test public void dequeueTest() {
        Queue<Integer> newQueue  = new Queue<>(null, null);
        newQueue.enqueue(1);
        int res = newQueue.dequeue().getValue();
        assertEquals("Should be same", 1, res);
    }

    //dequeue out of a queue the expected value
    @Test public void dequeueTest_multipleValues() {
        Queue<Integer> newQueue  = new Queue<>(null, null);
        newQueue.enqueue(2);
        newQueue.enqueue(4);
        newQueue.enqueue(6);

        int res = newQueue.dequeue().getValue();
        assertEquals("Should be same", 2, res);
    }

    // successfully peek into a queue, seeing the expected value
    @Test public void peekTest() {
        Queue<Integer> newQueue  = new Queue<>(null, null);
        newQueue.enqueue(1);
        int res = newQueue.peek().getValue();
        assertEquals("Should be same", 1, res);
    }

    //successfully peek into a queue with multiple nodes, seeing the expected value
    @Test public void peekTest_multipleValues() {
        Queue<Integer> newQueue  = new Queue<>(null, null);
        newQueue.enqueue(3);
        newQueue.enqueue(1);
        newQueue.enqueue(2);
        int res = newQueue.peek().getValue();
        assertEquals("Should be same", 3, res);
    }

    //Empty Queue after dequeue multiple values
    @Test public void dequeueTest_emptyAfterDequeueMultipleValues() {
        Queue<Integer> newQueue  = new Queue<>(null, null);
        newQueue.enqueue(2);
        newQueue.enqueue(4);
        newQueue.enqueue(6);

        newQueue.dequeue();
        newQueue.dequeue();
        newQueue.dequeue();
        assertEquals("Should be equal", "Front <--Rear", newQueue.toString());
    }





}