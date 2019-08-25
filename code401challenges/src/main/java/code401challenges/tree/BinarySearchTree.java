package code401challenges.tree;


import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
    private Node root;

    public void add(int value) {
        if(value == root.getData()){
            return;
        }
        if(value < root.getData()){
            if(root.getLeftChildNode() == null) {
                root.setLeftChildNode(new Node(value));
            } else {
                root.getRightChildNode().setData(value);
                //I can not call add method, recursively???
                //root.getRightChildNode().add(value);
            }

        }
        else {
            if(root.getRightChildNode() == null) {
                root.setRightChildNode(new Node(value));
            } else {
                root.getRightChildNode().setData(value);
                //I can not call add method, recursively???
                //root.getRightChildNode().add(value);
            }
        }



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

    //Contain Method
//    public boolean contain(int value) {
//        if(value == root.getData()) {
//            return true;
//        }
//        if(value < root.getData())
//    }








}
