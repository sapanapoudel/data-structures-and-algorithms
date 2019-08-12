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


    public void printLinkedList() {
        String output = "";
        Node current = this.head;
        System.out.print("HEAD -->");
        while(current != null) {
            System.out.print(current.getValue());
            System.out.print("-->");
            current = current.getNextNode();
        }

        System.out.println("null");
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

