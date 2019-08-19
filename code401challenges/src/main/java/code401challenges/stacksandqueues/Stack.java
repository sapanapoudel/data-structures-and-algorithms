package code401challenges.stacksandqueues;

public class Stack <T>{
    private Node<T> top;

    public Stack(Node<T> top) {
        this.top = null;
    }

    public Node<T> getTop() {
        return top;
    }

    public void setTop(Node<T> top) {
        this.top = top;
    }

    //toString method
    public String toString() {
        String result = "TOP";
        Node<T> current = this.top;
        while(current != null) {
            result = result +  "--> " + current.getValue();
            current = current.getNextNode();
        }
        result = result + "--> null";
        return result;
    }

    //Method called Push which pushes new node into a stack
    public void push(T value) {
        Node<T> newNode = new Node<>(value, null);
        newNode.setNextNode(this.top);
        this.top = newNode;
    }

    //Method called pop to remove node from stack
    public Node<T> pop() {
        Node<T> temp = this.top;
        this.top = top.getNextNode();
        temp.setNextNode(null);
        return temp;
    }

    //Method called Peek to view top node
    public Node<T> peek() {
        return this.top;
    }
}
