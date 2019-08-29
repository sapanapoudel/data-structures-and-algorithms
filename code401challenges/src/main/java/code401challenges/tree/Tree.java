package code401challenges.tree;

import code401challenges.stacksandqueues.Queue;

import java.util.*;

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

    //breadth first traversal method
    //Input = root node
    //Output = front node of queue to console
    //Create empty queue and add root of the tree

    public List breadthFirstTraverse(Tree newTree) {
        Queue<Node> queue = new Queue<>();
        List frontNodeValues = new ArrayList<>();
        queue.enqueue(newTree.getRoot());

        while(!queue.isEmpty()) {
            Node current = queue.dequeue();
            frontNodeValues.add(current.getData());
            if(current.getLeftChildNode() != null){
                queue.enqueue( current.getLeftChildNode());
            }
            else if(current.getRightChildNode() != null) {
                queue.enqueue(current.getRightChildNode());
            }
        }
        return frontNodeValues;
    }

    //Find the maximum value of the tree
    public int findMaxValue(Node root) {
       if(root == null) {
           return Integer.MIN_VALUE;
       }
       int output = (int)root.getData();
       int leftOutput = findMaxValue(root.getLeftChildNode());
       int rightOutput = findMaxValue(root.getRightChildNode());
       if(leftOutput > output){
           output = leftOutput;
       }
       if(rightOutput > output) {
           output = rightOutput;
       }
       return  output;

    }

    //Find the minimum value in the tree
    public int findMinValue(Node root) {
        if(root == null) {
            return Integer.MAX_VALUE;
        }
        int output = (int)root.getData();
        int outputOnLeft = findMinValue(root.getLeftChildNode());
        int outputOnRight = findMinValue(root.getRightChildNode());
        if(outputOnLeft < output) {
            output = outputOnLeft;
        }
        if(outputOnRight < output) {
            output = outputOnRight;
        }
        return  output;
    }
}
