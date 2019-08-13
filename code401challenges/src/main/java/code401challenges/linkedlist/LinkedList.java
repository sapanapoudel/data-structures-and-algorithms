package code401challenges.linkedlist;

public class LinkedList<T> {
    //Fields
    private Node <T> head;

    public LinkedList() {
        this.head = null;
    }

    //Insert node
    public  void insert (T value) {
        LinkedList list = new LinkedList();
        Node<T>  newNode = new Node<T>(value, this.head );
        this.head = newNode;
        }

    //Includes
    public boolean includes (T value) {
        Node<T> current = this.head;
        while(current != null) {
            if(current.getValue() == value){
                return true;
            }

            current = current.getNextNode();
        }
        return false;
    }

    //toString
    public String toString() {
        String result = "HEAD";
        Node<T> current = this.head;
        while(current != null) {
            result = result +  "--> " + current.getValue();
            current = current.getNextNode();

        }
        result = result + "--> null";
        return result;
    }
    }

