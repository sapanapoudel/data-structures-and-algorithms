package code401challenges.stacksandqueues;

public class Node<T> {
    //fields
    private T value;
    private Node <T> nextNode;

    // Constructor
    public Node (T value, Node<T> nextNode) {
        this.value = value;
        this.nextNode = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
}
