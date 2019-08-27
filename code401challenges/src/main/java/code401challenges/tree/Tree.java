package code401challenges.tree;

import java.util.List;

public class Tree<T> {
    private Node<T> root;

    public Tree() {
        this.root = null;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    //Traverse Binary Search Tree in-order
    public List<T> inOrder(Node root, List<T> nodeValue) {
        if(root == null) {
            return nodeValue;
        }
        else {
            inOrder(root.getLeftChildNode(), nodeValue);
            nodeValue.add((T) root.getData());
            inOrder(root.getRightChildNode(), nodeValue);
        }
        return nodeValue;
    }


    //Traverse Binary Search Tree pre-order
    public List<T> preOrder(Node root, List<T> nodeValue) {
        if(root == null) {
            return nodeValue;
        }
        else {
            nodeValue.add((T) root.getData());
            preOrder(root.getLeftChildNode(), nodeValue);
            preOrder(root.getRightChildNode(), nodeValue);
        }
        return nodeValue;
    }

    //Traverse Binary Search Tree Post-order
    public List<T> postOrder(Node root, List<T> nodeValue) {
        if(root == null) {
            return nodeValue;
        } else {
            postOrder(root.getLeftChildNode(), nodeValue);
            postOrder(root.getRightChildNode(), nodeValue);
            nodeValue.add((T)root.getData());
        }
      return nodeValue;
    }




}
