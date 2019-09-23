package code401challenges.hashtable;

import code401challenges.tree.BinarySearchTree;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TreeIntersectionTest {

    @Test public void treeIntersectionTest(){
        BinarySearchTree tree1 = new BinarySearchTree();
        tree1.add(1);
        tree1.add(2);
        tree1.add(3);
        tree1.add(4);
        tree1.add(5);

        BinarySearchTree tree2 = new BinarySearchTree();
        tree2.add(1);
        tree2.add(2);
        tree2.add(3);
        tree2.add(4);
        tree2.add(7);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        assertEquals(arrayList, TreeIntersection.treeIntersection(tree1, tree2));

    }

    @Test public void noTreeInterSectionTest(){
        BinarySearchTree tree1 = new BinarySearchTree();
        tree1.add(1);
        tree1.add(2);
        tree1.add(3);
        tree1.add(4);
        tree1.add(5);

        BinarySearchTree tree2 = new BinarySearchTree();
        tree2.add(10);
        tree2.add(11);
        tree2.add(12);
        tree2.add(13);
        tree2.add(14);

        ArrayList<Integer> arrayList = new ArrayList<>();
        assertEquals(arrayList, TreeIntersection.treeIntersection(tree1, tree2));
    }

    @Test public void treeIntersectionTest_withDuplicateValue(){
        BinarySearchTree tree1 = new BinarySearchTree();
        tree1.add(1);
        tree1.add(2);
        tree1.add(2);
        tree1.add(4);
        tree1.add(5);

        BinarySearchTree tree2 = new BinarySearchTree();
        tree2.add(1);
        tree2.add(2);
        tree2.add(3);
        tree2.add(4);
        tree2.add(7);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(4);

        assertEquals(arrayList, TreeIntersection.treeIntersection(tree1, tree2));
    }


}