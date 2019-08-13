package code401challenges.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList();
        list.insert(6);
        list.insert(9);
        //System.out.println(list.toString());
        list.append(4);
        //System.out.println(list.toString());
//        list.insertBefore(3, 4);
//        System.out.println(list.toString());

        list.insertAfter(6, 8);
        System.out.println(list.toString());
    }
}
