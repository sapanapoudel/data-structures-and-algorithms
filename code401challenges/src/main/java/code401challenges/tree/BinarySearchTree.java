package code401challenges.tree;

public class BinarySearchTree extends Tree<Integer> {
    private Node root;

    public BinarySearchTree() {
        super();
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void add(int value) {
        if(root == null) {
            root = new Node(value);
        } else {
            addToHelper(value, root);
        }
    }

    public Node addToHelper(int value, Node<Integer> root) {
        if(root == null) {
            return new Node(value);
        }

        if(value < root.getData()){
            root.setLeftChildNode(addToHelper(value, root.getLeftChildNode()));
        } else if (value > root.getData()) {
            root.setRightChildNode(addToHelper(value, root.getRightChildNode()));
        }

        return root;
    }

    //Contain Method
    public boolean contain(Node<Integer> root, int value) {
       if(root == null) {
           return false;
       }
       if(root.getData() == value) {
           return true;
       }
       if(value < root.getData()){
           return contain(root.getLeftChildNode(), value);
       } else {
           return contain(root.getRightChildNode(), value);
       }
    }
}
