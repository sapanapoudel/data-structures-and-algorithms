package code401challenges.linkedlist;

public class LinkedList<T> {
    //Fields
    Node <T> head;

    public LinkedList() {
        this.head = null;
    }

    //Insert node
    public  void insert (T value) {
        LinkedList list = new LinkedList();
        Node  newNode = new Node(value, this.head );
        this.head = newNode;
        }

    //Includes
    public boolean includes (T value) {
        Node current = this.head;
        while(current != null) {
            if(current.getValue() == value)
                return true;
            current = current.getNextNode();
        }
        return false;
    }


    public String toString() {
        String result = "HEAD";
        Node current = this.head;
        while(current != null) {
            result = result +  "--> " + current.getValue();
            current = current.getNextNode();

        }
        result = result + "--> null";
        return result;



    }
    }

