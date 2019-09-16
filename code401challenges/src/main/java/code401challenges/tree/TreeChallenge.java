package code401challenges.tree;

public class TreeChallenge {
    /*
    Minimal Tree: Given a sorted array with unique integer elements, write an algorithm to create
    a binary search tree with a minimal height
    Approach:
    1. To create a minimal height of the tree, we need to match the number of nodes in the left subtree
    to the number of nodes to the right subtree as much as possible
    2. Root should be middle of the array

    The algorithm is as follows:
    1. Insert middle element of the array into tree
    2. Insert into the left subtree, the left sub array elements
    3. Insert into the right subtree, the right sub array elements
    4. Use recursion
     */

    public Node<Integer> createMinimalBST(int[] arr) {
        return createMinimalBSTNode(arr, 0, arr.length-1);
    }

    public Node<Integer> createMinimalBSTNode(int arr[], int start, int end) {
        if(end < start){
            return null;
        }
        else {
            int mid = (start + end)/ 2;
            Node n = new Node(arr[mid]);
            n.setLeftChildNode(new Node(createMinimalBSTNode(arr, start, mid - 1)));
            n. setRightChildNode(new Node(createMinimalBSTNode(arr, mid + 1, end)));
            return n;
        }

    }
}
