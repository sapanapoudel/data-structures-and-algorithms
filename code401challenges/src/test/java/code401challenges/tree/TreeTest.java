package code401challenges.tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TreeTest {
    @Test public void breadthFirstTraverseTest() {
        Tree<Integer> newTree = new Tree<Integer>();
        newTree.addAtNextOpenSpot(1);
        newTree.addAtNextOpenSpot(2);
        newTree.addAtNextOpenSpot(3);
        newTree.addAtNextOpenSpot(4);
        newTree.addAtNextOpenSpot(5);

        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        assertEquals(arrayList, newTree.breadthFirstTraverse(newTree));

    }

    @Test public void findMaxValueTest() {
        Tree<Integer> newTree = new Tree<Integer>();
        newTree.addAtNextOpenSpot(1);
        newTree.addAtNextOpenSpot(2);
        newTree.addAtNextOpenSpot(3);
        newTree.addAtNextOpenSpot(4);
        newTree.addAtNextOpenSpot(5);
        assertEquals(5, newTree.findMaxValue(newTree.getRoot()));

    }

    @Test public void findMaxValueTest_Root() {
        Tree<Integer> newTree = new Tree<Integer>();
        newTree.addAtNextOpenSpot(1);

        assertEquals(1, newTree.findMaxValue(newTree.getRoot()));

    }

    @Test public void findMaxValueTest_Empty(){
        Tree<Integer> newTree = new Tree<>();
        assertEquals(Integer.MIN_VALUE, newTree.findMaxValue(newTree.getRoot()));
    }

    @Test public void findMinValueTest() {
        Tree<Integer> newTree = new Tree<Integer>();
        newTree.addAtNextOpenSpot(1);
        newTree.addAtNextOpenSpot(2);
        newTree.addAtNextOpenSpot(3);
        newTree.addAtNextOpenSpot(4);
        newTree.addAtNextOpenSpot(5);
        assertEquals(1, newTree.findMinValue(newTree.getRoot()));

    }


    @Test public void findMinValueTest_Root() {
        Tree<Integer> newTree = new Tree<Integer>();
        newTree.addAtNextOpenSpot(1);

        assertEquals(1, newTree.findMinValue(newTree.getRoot()));

    }

    @Test public void findMinValueTest_Empty(){
        Tree<Integer> newTree = new Tree<>();
        assertEquals(Integer.MAX_VALUE, newTree.findMinValue(newTree.getRoot()));
    }


}