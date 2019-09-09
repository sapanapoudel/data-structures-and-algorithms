package code401challenges.linkedlist;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LinkedListTest {
    //================Test for Insert=================================================
    //Can successfully instantiate an empty linked list
    //Can properly insert into the linked list
    //The head property will properly point to the first node in the linked list
    //Can properly insert multiple nodes into the linked list
    @Test public void testLinkedList () {
        LinkedList<Integer> list = new LinkedList<>();
        list.insert(6);
        list.insert(9);
        assertEquals("should be equal", "HEAD--> 9--> 6--> null", list.toString());

    }

    //=====================Test for Include====================================
    //Will return true when finding a value within the linked list that exists
    @Test public void includesTest_True() {
        LinkedList<Integer> list = new LinkedList<>();
        list.insert(6);
        list.insert(9);

        assertEquals("should be true", true, list.includes(6));

    }

    //Will return false when searching for a value in the linked list that does not exist
    @Test public void includesTest_False() {
        LinkedList<Integer> list = new LinkedList<>();
        list.insert(6);
        list.insert(9);

        assertEquals("should be true", false, list.includes(5));
    }

    //==========================Append at the end===============================
    @Test public void appendTest() {
        LinkedList<Integer> list = new LinkedList<>();
        list.insert(6);
        list.insert(9);
        list.append(4);
        assertEquals("should be equal", "HEAD--> 9--> 6--> 4--> null", list.toString());
    }
    @Test public void appendTest_emptyLL() {
        LinkedList<Integer> list = new LinkedList<>();
        list.append(3);
        assertEquals("should be equal", "HEAD--> 3--> null", list.toString());
    }

    //=============================Test for Insert Before=================================
    @Test public void insertBeforeTest() {
        LinkedList<Integer> list = new LinkedList<>();
        list.insert(6);
        list.insert(9);
        list.append(4);
        list.insertBefore(3, 4);
        assertEquals("should be equal","HEAD--> 9--> 6--> 3--> 4--> null",
                list.toString());
    }

    @Test public void insertBeforeTest_beforeFIrstNode() {
        LinkedList<Integer> list = new LinkedList<>();
        list.insert(6);
        list.insertBefore(3, 6);
        assertEquals("should be equal","HEAD--> 3--> 6--> null",
                list.toString());
    }

    //==================Insert After===============================================
        @Test public void insertAfter() {
            LinkedList<Integer> list = new LinkedList<>();
            list.insert(6);
            list.insert(9);
            list.append(4);
            list.insertAfter(11, 4);
            assertEquals("should be equal","HEAD--> 9--> 6--> 4--> 11--> null",
                    list.toString());

        }

        @Test public void insertAfter_middle() {
            LinkedList<Integer> list = new LinkedList<>();
            list.insert(6);
            list.insert(9);
            list.insert(5);
            list.insert(3);
            list.append(4);
            list.insertAfter(11, 5);
            assertEquals("should be equal","HEAD--> 3--> 5--> 11--> 9--> 6--> 4--> null",
                    list.toString());
        }

        //============================================================================
        //method for the Linked List class that takes a number, k, as a parameter.
        // Return the node’s value that is k from the end of the linked list

    //Source: https://junit.org/junit4/faq.html#atests_7
    @Test (expected=IndexOutOfBoundsException.class)
    public void kthFromEndTest_greaterLength()  {
        LinkedList<Integer> list = new LinkedList<>();
        list.insert(6);
        list.insert(9);

        list.kthFromEnd(3);
    }

    @Test (expected=IndexOutOfBoundsException.class)
    public void kthFromEndTest_negative()  {
        LinkedList<Integer> list = new LinkedList<>();
        list.insert(6);
        list.insert(9);

        list.kthFromEnd(-3);
    }


    @Test (expected=IndexOutOfBoundsException.class)
    public void kthFromEndTest_zer0()  {
        LinkedList<Integer> list = new LinkedList<>();
        list.insert(6);
        list.insert(9);

        list.kthFromEnd(0);
    }

    @Test public void kthFromEndTest_sameLength () {
        LinkedList<Integer> list = new LinkedList<>();
        list.insert(6);
        list.insert(9);
        assertTrue(list.kthFromEnd(2).equals(9));
    }


    @Test public void kthFromEndTest_LinkedListOfSize1 () {
        LinkedList<Integer> list = new LinkedList<>();
        list.insert(6);
        assertTrue(list.kthFromEnd(1).equals(6));
    }

    //=======================Merge Two Linked Lists===================================
    //Test list 1 and list2 when both have same length
    @Test public void mergeListsTest_bothSameLength() {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.insert(1);
        list1.insert(3);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.insert(2);
        list2.insert(4);
        assertEquals("should be equal", "HEAD--> 3--> 4--> 1--> 2--> null",
                LinkedList.mergeLists(list1, list2).toString());
    }

    //Test: when both have different lengths
    @Test public  void mergeListsTest_differentLength() {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.insert(1);
        list1.insert(3);
        list1.insert(5);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.insert(2);
        list2.insert(4);

        assertEquals("should be equal", "HEAD--> 5--> 4--> 3--> 2--> 1--> null",
                LinkedList.mergeLists(list1, list2).toString());
    }

    //Test: When merging with empty lists
    @Test public void mergeListsTest_list2IsEmpty() {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.insert(1);
        list1.insert(3);
        list1.insert(5);

        LinkedList<Integer> list2 = new LinkedList<>();
        assertEquals("should be equal", "HEAD--> 5--> 3--> 1--> null",
                LinkedList.mergeLists(list1, list2).toString());

    }
    //Test: When both empty lists
    @Test public void mergeListsTest_bothEmpty() {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        assertEquals("should be equal", "HEAD--> null",
                LinkedList.mergeLists(list1, list2).toString());
    }

    //Test for reverse linked list
    @Test public void reverseLinkedListTest() {
        LinkedList<Integer> list = new LinkedList<>();
        list.insert(1);
        list.insert(2);
        list.insert(3);
//        list.reverseLinkedList(1);
    }

}