package code401challenges.hashtable;

import code401challenges.tree.BinarySearchTree;

import java.util.ArrayList;
import java.util.HashMap;

public class TreeIntersection {
    public static ArrayList<Integer> treeIntersection(BinarySearchTree tree1, BinarySearchTree tree2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        ArrayList<Integer> s1 = (ArrayList<Integer>) tree1.inOrder(tree1.getRoot(), new ArrayList<>());
        ArrayList<Integer> s2 = (ArrayList<Integer>) tree2.inOrder(tree2.getRoot(), new ArrayList<>());
        ArrayList<Integer> intersectionList = new ArrayList<>();
        for(int i : s1) {
            hashMap.put(i, i);
        }
        for(int item : s2){
            if(hashMap.containsKey(item)){
                intersectionList.add(item);
            }
        }
       return intersectionList;
    }
}