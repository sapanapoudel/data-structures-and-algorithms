package code401challenges.linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {

    //Can successfully instantiate an empty linked list
    //Can properly insert into the linked list
    //The head property will properly point to the first node in the linked list
    //Can properly insert multiple nodes into the linked list
    @Test public void testLinkedList () {
        LinkedList<Integer> list = new LinkedList();
        list.insert(6);
        list.insert(9);
        assertEquals("should be equal", "HEAD--> 9--> 6--> null", list.toString());

    }

    //Will return true when finding a value within the linked list that exists
    @Test public void includesTest_True() {
        LinkedList<Integer> list = new LinkedList();
        list.insert(6);
        list.insert(9);

        assertEquals("should be true", true, list.includes(6));

    }

    //Will return false when searching for a value in the linked list that does not exist
    @Test public void includesTest_False() {
        LinkedList<Integer> list = new LinkedList();
        list.insert(6);
        list.insert(9);

        assertEquals("should be true", false, list.includes(5));
    }

}