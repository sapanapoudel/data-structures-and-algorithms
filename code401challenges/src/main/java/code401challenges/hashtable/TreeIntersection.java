package code401challenges.hashtable;

import code401challenges.tree.Node;

import java.util.ArrayList;

public class TreeIntersection {
    public static void addInToArrayList(Node root, ArrayList arrayList) {
        if (root != null) {
            return;
        }
        addInToArrayList(root.getLeftChildNode(), arrayList);
        arrayList.add(root.getData());
        addInToArrayList(root.getRightChildNode(), arrayList);

    }

    public static HashTable treeIntersection(Node root1, Node root2) {
        HashTable<Integer, Integer> ht = new HashTable<>(1024);
        ArrayList<Integer> s1 = new ArrayList<>();
        ArrayList<Integer> s2 = new ArrayList<>();
        addInToArrayList(root1, s1);
        addInToArrayList(root2, s2);
        for(int item : s1){
            if(s2.contains(item)){
                ht.add(item, item);
                ht.get(item);
            }
        }
        return ht;
    }
}