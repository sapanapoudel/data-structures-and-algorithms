package code401challenges.linkedlist;

public class LinkedList<T> {
    //Fields
    Node <T> head;
    

    public LinkedList() {
        this.head = null;
    }

    //Insert node
    public  void insert (T value) {
        LinkedList<Integer>list = new LinkedList<>();
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

    //Append node at the end
    public void append (T value) {
        Node<T> newNode = new Node<>(value, this.head);
        Node<T> current = this.head;
        if (current == null) {
            current = newNode;
            this.head = current;
            return;
        }
        newNode.setNextNode(null);

        while(current.getNextNode() != null){
            current = current.getNextNode();
        }
        current.setNextNode(newNode);
    }

    //Insert Before
    public void insertBefore(T newVal, T curValue) {
        Node<T> newNode = new Node<T>(newVal, null);
        Node<T> current = this.head;
        Node<T> previous = null;
        if(head.getValue() == curValue){
            newNode.setNextNode(this.head);
            this.head = newNode;
            return;
        }
        while(current != null) {
            if(current.getValue().equals(curValue)) {
                newNode.setNextNode(current);
                assert previous != null;
                previous.setNextNode(newNode);
                break;
            } else {
                previous = current;
                current = current.getNextNode();
            }
        }
    }

    //Insert After
    public void insertafter(T newValue, T curValue) {
        Node<T> newNode = new Node<T>(newValue, null);
        Node<T> current = this.head;
        while(current != null) {
            if(current.getValue().equals(curValue)) {
                newNode.setNextNode(current.getNextNode());
                current.setNextNode(newNode);
                break;
            }
            current = current.getNextNode();
        }
    }


    //method for the Linked List class that takes a number, k, as a parameter.
    // Return the node’s value that is k from the end of the linked list
    public T kthFromEnd(int k) {
        Node<T> mainPtr = this.head;
        Node<T> current = this.head;
        int count = 0;

        if(k <= 0 || k < 0){
            throw new IndexOutOfBoundsException();
        }

        if(this.head != null){
            while(count < k) {
                if(current == null) {

                    throw new IndexOutOfBoundsException();
                }
                current = current.getNextNode();
                count++;
            }
            while(current != null) {
                mainPtr = mainPtr.getNextNode();
                current = current.getNextNode();
            }


//            System.out.println("node's value that is " + k + " from the end of the list is:  " + mainPtr.getValue());;
        }
        return  mainPtr.getValue();
    }

    }

