package code401challenges.linkedlist;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {
    //================Test for Insert=================================================
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

    //=====================Test for Include====================================
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

    //==========================Append at the end===============================
    @Test public void appendTest() {
        LinkedList<Integer> list = new LinkedList();
        list.insert(6);
        list.insert(9);
        list.append(4);
        assertEquals("should be equal", "HEAD--> 9--> 6--> 4--> null", list.toString());
    }
    @Test public void appendTest_emptyLL() {
        LinkedList<Integer> list = new LinkedList();
        list.append(3);
        System.out.println(list.toString());
        assertEquals("should be equal", "HEAD--> 3--> null", list.toString());
    }

    //=============================Test for Insert Before=================================
    @Test public void insertBeforeTest() {
        LinkedList<Integer> list = new LinkedList();
        list.insert(6);
        list.insert(9);
        list.append(4);
        list.insertBefore(3, 4);
        assertEquals("should be equal","HEAD--> 9--> 6--> 3--> 4--> null",
                list.toString());
    }

    @Test public void insertBeforeTest_beforeFIrstNode() {
        LinkedList<Integer> list = new LinkedList();
        list.insert(6);
        list.insertBefore(3, 6);
        assertEquals("should be equal","HEAD--> 3--> 6--> null",
                list.toString());
    }

    //==================Insert After===============================================
        @Test public void insertAfter() {
            LinkedList<Integer> list = new LinkedList();
            list.insert(6);
            list.insert(9);
            list.append(4);
            list.insertafter(11, 4);
            assertEquals("should be equal","HEAD--> 9--> 6--> 4--> 11--> null",
                    list.toString());

        }

        @Test public void insertAfter_middle() {
            LinkedList<Integer> list = new LinkedList();
            list.insert(6);
            list.insert(9);
            list.insert(5);
            list.insert(3);
            list.append(4);
            list.insertafter(11, 5);
            assertEquals("should be equal","HEAD--> 3--> 5--> 11--> 9--> 6--> 4--> null",
                    list.toString());
        }

        //============================================================================
        //method for the Linked List class that takes a number, k, as a parameter.
        // Return the node’s value that is k from the end of the linked list

    @Test public void kthFromEndTest_greaterLength() {
        LinkedList<Integer> list = new LinkedList();
        list.insert(6);
        list.insert(9);
        list.kthFromEnd(3);
        assertEquals("3 is greater than the length of the linked list.",
                "3 is greater than the length of the linked list.");
    }

    @Test public void kthFromEndTest_sameLength () {
        LinkedList<Integer> list = new LinkedList();
        list.insert(6);
        list.insert(9);
        list.kthFromEnd(2);
        assertEquals("node's value that is 2 from the end of the list is:  9",
                "node's value that is 2 from the end of the list is:  9");
    }

    @Test public void kthFromEndTest_LLOfsize1 () {
        LinkedList<Integer> list = new LinkedList();
        list.insert(6);
        list.kthFromEnd(1);
        assertEquals("node's value that is 1 from the end of the list is:  6",
                "node's value that is 1 from the end of the list is:  6");
    }

}