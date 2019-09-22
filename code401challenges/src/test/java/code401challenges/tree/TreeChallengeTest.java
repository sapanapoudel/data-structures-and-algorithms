package code401challenges.tree;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TreeChallengeTest {

    @Test public void createDepthListTest(){
        Tree<Integer> newTree = new Tree<Integer>();
        newTree.addAtNextOpenSpot(10);
        newTree.addAtNextOpenSpot(2);
        newTree.addAtNextOpenSpot(33);
        newTree.addAtNextOpenSpot(14);

        newTree.addAtNextOpenSpot(5);


        System.out.println(TreeChallenge.isBalanced(newTree.getRoot()));

    }

}