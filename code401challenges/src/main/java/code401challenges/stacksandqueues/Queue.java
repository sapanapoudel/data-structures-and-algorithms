package code401challenges.stacksandqueues;

public class Queue <T> {
    private Node<T> front;
    private Node<T> rear;

    public Queue(Node<T> front, Node<T> rear) {
        this.rear = null;
        this.front = null;
    }

    public Node<T> getFront() {
        return front;
    }

    public void setFront(Node<T> front) {
        this.front = front;
    }

    public Node<T> getRear() {
        return rear;
    }

    public void setRear(Node<T> rear) {
        this.rear = rear;
    }

    //toString method

    @Override
    public String toString() {
        String result = "Front";
        Node<T> current = this.front;
        while(current != null) {
            result = result +  "--> " + current.getValue();
            current = current.getNextNode();
        }
        result = result + " <--Rear";
        return result;
    }

    //Methods that takes value as an argument and create newNode with that value and add to the Queue

    public void enqueue(T value) {
        Node <T> newNode = new Node<>(value, null);
        if(this.front != null) {
            this.rear.setNextNode(newNode);
            this.rear = newNode;
        } else {
            this.front = newNode;
            this.rear = this.front;
        }

    }

    public Node <T> dequeue() {
        Node<T> temp = this.front;
        this.front = this.front.getNextNode();
        temp.setNextNode(null);
        return temp;
    }

    public Node<T> peek() {
        return this.front;
    }






}