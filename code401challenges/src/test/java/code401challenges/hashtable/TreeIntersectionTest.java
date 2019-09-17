package code401challenges.hashtable;

import code401challenges.tree.Node;
import code401challenges.tree.Tree;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeIntersectionTest {

    @Test public void treeIntersectionTest(){
        Tree<Integer> tree1 = new Tree<Integer>();
        tree1.addAtNextOpenSpot(1);
        tree1.addAtNextOpenSpot(2);
        tree1.addAtNextOpenSpot(3);
        tree1.addAtNextOpenSpot(4);
        tree1.addAtNextOpenSpot(5);

        Tree<Integer> tree2 = new Tree<Integer>();
        tree2.addAtNextOpenSpot(1);
        tree2.addAtNextOpenSpot(2);
        tree2.addAtNextOpenSpot(3);
        tree2.addAtNextOpenSpot(4);
        tree2.addAtNextOpenSpot(5);
        System.out.println(TreeIntersection.treeIntersection(tree1.getRoot(), tree2.getRoot()));

    }


}