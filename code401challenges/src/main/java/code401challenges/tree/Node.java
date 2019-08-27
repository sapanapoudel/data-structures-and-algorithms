package code401challenges.tree;

public class Node<T> {
    private T data;
    private Node leftChildNode;
    private Node rightChildNode;

    //Constructor
    public Node( T data) {
        this.data = data;
    }

    //Getter and Setter
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data =  data;
    }

    public Node getLeftChildNode() {
        return leftChildNode;
    }

    public void setLeftChildNode(Node leftChildNode) {
        this.leftChildNode = leftChildNode;
    }

    public Node getRightChildNode() {
        return rightChildNode;
    }

    public void setRightChildNode(Node rightChildNode) {
        this.rightChildNode = rightChildNode;
    }

}
