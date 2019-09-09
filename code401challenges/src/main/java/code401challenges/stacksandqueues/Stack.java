package code401challenges.stacksandqueues;

import java.util.ArrayList;
import java.util.List;

public class Stack <T>{
    private Node<T> top;

    public Stack(Node<T> top) {
        this.top = null;
    }

    public Stack() {
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
    public T pop() throws NullPointerException{
        if(this.peek() == null) {
            throw new NullPointerException();
        }
        Node<T> temp = this.top;
        this.top = top.getNextNode();
        temp.setNextNode(null);
        return temp.getValue();
    }

    //Method called Peek to view top node
    public T peek() {
        if(this.top == null) {
            return null;
        }
        return  this.top.getValue();
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    //Find max value in stack
    public int max(Stack<Integer> stack){
        int max = Integer.MIN_VALUE;
        while(!stack.isEmpty()){
            max = Math.max(stack.pop(), max);
        }
        return max;
    }

    //Find min value in stack
    public int min(Stack<Integer> stack) {
        int min = Integer.MAX_VALUE;
        while(!stack.isEmpty()){
            min = Math.min(stack.pop(), min);
        }
        return min;
    }
}
