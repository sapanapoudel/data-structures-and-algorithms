package code401challenges.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList();
        list.insert(6);
//        list.insert(9);
//        list.insert(1);
        System.out.println(list.toString());

//        list.printLinkedList();
        System.out.println(list.includes(6));
    }
}
