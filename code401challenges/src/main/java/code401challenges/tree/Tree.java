package code401challenges.tree;

import java.util.ArrayList;
import java.util.LinkedList;
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

    //Add method in Tree
    public void addAtNextOpenSpot(T value) {
        Node<T> newNode = new Node<>(value);
        if (this.root == null) {
            this.root = newNode;
            return;
        }
        LinkedList<Node<T>> nodesToCheck = new LinkedList<>();
        nodesToCheck.addLast(this.root);
        while(true) {
            Node<T> current = nodesToCheck.removeFirst();
            if(current.getLeftChildNode() == null) {
                current.setLeftChildNode(newNode);
                return;
            } else if (current.getRightChildNode() == null) {
                current.setRightChildNode(newNode);
                return;
            } else {
                nodesToCheck.addLast(current.getLeftChildNode());
                nodesToCheck.addLast(current.getRightChildNode());
            }
        }
    }

    //Print  method
    public String print(Node root)  {
        return inOrder(root, new ArrayList<>()).toString();
    }
}
