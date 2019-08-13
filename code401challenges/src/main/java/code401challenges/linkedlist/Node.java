package code401challenges.linkedlist;

//<T> = T stands for Type , which could be anything,
public class Node <T>{
    //Fields
    private T value;
    private Node<T> nextNode; // nextNode is also a Node

    //Constructor
    public Node(T value, Node nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public Node<T> getNextNode (){
        return this.nextNode;
    }
    public T getValue () {
        return this.value;
    }
}
