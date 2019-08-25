package code401challenges.tree;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    private Node root;

    //Pre-order method
    public List<Integer> preOrder(Node root) {
        List<Integer> nodeValue = new ArrayList<Integer>();
        if(root != null){
            preOrder(root);
        }
        System.out.println(nodeValue.add(root.getData()));
        if(root.getLeftChildNode() != null) {
            preOrder(root.getLeftChildNode());
        }
        if(root.getRightChildNode() != null) {
            preOrder(root.getRightChildNode());
        }
        return nodeValue;

    }

    //In-order Traverse Method
    public List<Integer> inOrder(Node root) {
        List<Integer> nodeValue = new ArrayList<>();
        if(root != null){
            inOrder(root);
        }

        if(root.getLeftChildNode() != null) {
            inOrder(root.getLeftChildNode());
        }
        System.out.println(nodeValue.add(root.getData()));
        if(root.getRightChildNode() != null) {
            inOrder(root.getRightChildNode());
        }
        return nodeValue;
    }

    //Post-order Traverse Method
    public List<Integer> postOrder(Node root) {
        List<Integer> nodeValue = new ArrayList<>();
        if(root != null){
            postOrder(root);
        }
        if(root.getLeftChildNode() != null) {
            postOrder(root.getLeftChildNode());
        }
        if(root.getRightChildNode() != null) {
            postOrder(root.getRightChildNode());

        }
        System.out.println(nodeValue.add(root.getData()));
        return nodeValue;
    }

}
