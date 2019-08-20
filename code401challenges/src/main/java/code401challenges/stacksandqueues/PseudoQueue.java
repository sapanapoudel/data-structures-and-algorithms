package code401challenges.stacksandqueues;

public class PseudoQueue <T>{

    protected Stack<T> stack1 = new Stack<>();
    protected Stack<T> stack2 = new Stack<>();

    public void enqueue(T value) {

        stack1.push(value);
    }

    public Node<T> dequeue() {
        if(stack2.getTop() == null) {
            while(stack1.getTop() != null) {
                stack2.push((T) stack1.pop());
            }
        } else {
            stack2.pop();
        }

        return (Node<T>) stack2.peek().getValue();

    }
}
