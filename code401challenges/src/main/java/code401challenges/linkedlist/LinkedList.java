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
    public void insertAfter(T newValue, T curValue) {
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
            throw new IndexOutOfBoundsException("k cannot be negative.");
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

        }
        return  mainPtr.getValue();
    }

    //Method to merge two linked lists
    public static<F> LinkedList<F> mergeLists(LinkedList<F> listOne, LinkedList<F> listTwo) {
        Node<F> currentFirst = listOne.head;
        Node<F> currentSecond = listTwo.head;
        if(currentFirst == null) {
            return listTwo;
        }
        if (currentSecond == null) {
            return listOne;
        }
        Node<F>  zPointer = currentFirst;
        Node<F> tPointer = currentFirst;
        currentFirst = currentFirst.getNextNode();
        while(currentFirst != null && currentSecond != null) {
            tPointer.setNextNode(currentSecond);
            currentSecond = currentSecond.getNextNode();
            tPointer = tPointer.getNextNode();
            tPointer.setNextNode(currentFirst);
            currentFirst = currentFirst.getNextNode();
            tPointer = tPointer.getNextNode();
        }

        if(currentSecond != null) {
            tPointer.setNextNode(currentSecond);
        }
        else if (currentFirst != null) {
            tPointer.setNextNode(currentFirst);
        }
        else {
            tPointer.setNextNode(null);
        }
        listOne.head = zPointer;
        return  listOne;
    }

    //Recursive Methods for Merging
    public static Node merge(Node head1, Node head2) {
        if(head1 == null) {
            return head2;
        } else if(head2 == null) {
            return head1;
        } else {
            Node restOfTheListsList = merge(head1.getNextNode(), head2.getNextNode());
            head1.setNextNode(head2);
            head2.setNextNode(restOfTheListsList);
            return  head1;
        }


    }

    //Another Version
    public static Node merge_better(Node head1, Node head2) {
        if(head1 == null) {
            return head2;
        } else {
            head1.setNextNode(merge_better(head2, head1.getNextNode()));

            return  head1;
        }


    }
    //Reverse LinkedList
    public Node reverseLinkedList(T head) {
        Node <T> previous = null; //point at last null
        Node<T> current = (Node<T>) head; //point at head
        while(current != null) {                //n: Time complexity O(n)
            Node temp = current.getNextNode(); //temp pointing at head.next
            current.setNextNode(previous);
            previous = current;
            current = temp;

        }
        return previous;
    }

    //Palidrome


    }

