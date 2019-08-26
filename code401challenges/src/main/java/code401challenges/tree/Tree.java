package code401challenges.tree;

import java.util.List;

public class Tree {
    private Node root;

    public Tree() {
        this.root = null;
    }

    //Traverse Binary Search Tree in-order
    public List<Integer> inOrder(Node root, List<Integer> nodeValue) {
        if(root == null) {
            return nodeValue;
        }
        else {
            inOrder(root.getLeftChildNode(), nodeValue);
            nodeValue.add(root.getData());
            inOrder(root.getRightChildNode(), nodeValue);
        }
        return nodeValue;
    }


    //Traverse Binary Search Tree pre-order
    public List<Integer> preOrder(Node root, List<Integer> nodeValue) {
        if(root == null) {
            return nodeValue;
        }
        else {
            nodeValue.add(root.getData());
            preOrder(root.getLeftChildNode(), nodeValue);
            preOrder(root.getRightChildNode(), nodeValue);
        }
        return nodeValue;
    }

    //Traverse Binary Search Tree Post-order
    public List<Integer> postOrder(Node root, List<Integer> nodeValue) {
        if(root == null) {
            return nodeValue;
        } else {
            postOrder(root.getLeftChildNode(), nodeValue);
            postOrder(root.getRightChildNode(), nodeValue);
            nodeValue.add(root.getData());
        }
      return nodeValue;
    }




}
