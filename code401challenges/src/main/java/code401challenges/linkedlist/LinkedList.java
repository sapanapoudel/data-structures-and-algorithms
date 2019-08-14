package code401challenges.linkedlist;

public class LinkedList<T> {
    //Fields
    Node <T> head;
    

    public LinkedList() {
        this.head = null;
    }

    //Insert node
    public  void insert (T value) {
        LinkedList<Integer>list = new LinkedList();
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

//    public void append(T value) {
//        Node <T> newNode = new Node<>(value, this.head);
//        Node<T> current = this.head;
//        while(current.getNextNode() != null) {
//            current = current.getNextNode();
//        }
//        if(this.head == null) {
//            this.head = newNode;
//
//        }
//        newNode.setNextNode(null);
////        current.setNextNode(newNode);
//    }

//    while Current.Next is not equal to NULL
//				if Current.Next.Value is equal to existingNode.Value
//    newNode.Next <-- existingNode
//    Current.Next <-- newNode
//
//    Current <-- Current.Next;

    //InsertBefore
    public void insertBefore(T newVal, T value) {
        Node<T> current = this.head;
        while(current.getNextNode() != null) {
            if(current.getNextNode().getValue() == value) {
                Node<T> newNode = new Node<>(newVal, this.head);
                newNode.setNextNode(current.getNextNode());
                current.setNextNode(newNode);

            }
            current = current.getNextNode();
            return;
        }
    }

    //InsertAfter
    public void insertAfter(T value, T newValue) {
        //Check if the given node is null
        Node<T> previousNode = Node<T>(value,this.head)
        if(current == null) {
            System.out.println("The previous node is null");
        }
        Node<T> newNode = new Node<>(newValue, this.head);
        newNode.setNextNode(null);
        current.setNextNode(newNode);
    }

    }

