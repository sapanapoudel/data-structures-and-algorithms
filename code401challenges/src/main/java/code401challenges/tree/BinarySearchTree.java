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
        if (root == null) {
            root = new Node(value);
        } else {
            addToHelper(value, root);
        }
    }

    public Node addToHelper(int value, Node<Integer> root) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.getData()) {
            root.setLeftChildNode(addToHelper(value, root.getLeftChildNode()));
        } else if (value > root.getData()) {
            root.setRightChildNode(addToHelper(value, root.getRightChildNode()));
        }

        return root;
    }

    //Contain Method
    public boolean contain(Node<Integer> root, int value) {
        if (root == null) {
            return false;
        }
        if (root.getData() == value) {
            return true;
        }
        if (value < root.getData()) {
            return contain(root.getLeftChildNode(), value);
        } else {
            return contain(root.getRightChildNode(), value);
        }
    }

    //Find the sum of all the odd numbers in a binary search tree.
    public int sumOfAllOddValue(Node<Integer> root, int sum) {
        if (root == null) {
            return 0;
        } else {
            if(root != null) {
                if (root.getData() % 2 != 0) {
                    sum += root.getData();
                }
                sum += sumOfAllOddValue(root.getLeftChildNode(), sum);
                sum += sumOfAllOddValue(root.getRightChildNode(), sum);
            }

        }

            return sum;
    }

    //Comparing two file different file directories, create a method that takes in 2 directory
    // structures and compares both and determines whether or not they have the same number of
    // individual files. Comparing the leafs.

    public boolean compareFile(Node<Integer> root1, Node<Integer> root2) {
        int count1 = 0;
        int count2 = 0;
        if(root1 == null || root2 == null) {
            return false;
        } if(root1 != null && root2 != null) {
            if(root1.getLeftChildNode() == null && root1.getRightChildNode() == null){
                count1++;
            }
            if(root2.getRightChildNode() == null && root2.getRightChildNode() == null){
                count2++;
            }
        }
        if(count1 == count2){
            return true;
        }
        return false;
    }
}
