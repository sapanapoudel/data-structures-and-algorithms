package code401challenges.tree;

import java.util.ArrayList;
import java.util.LinkedList;

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

    public static Node<Integer> createMinimalBST(int[] arr) {
        return createMinimalBSTNode(arr, 0, arr.length-1);
    }

    public static Node<Integer> createMinimalBSTNode(int arr[], int start, int end) {
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


    //List of depth in Binary Tree
    public static ArrayList<LinkedList<Node>> createListInDepth(Node root) {
        ArrayList<LinkedList<Node>> result = new ArrayList<LinkedList<Node>>();
        LinkedList<Node> current = new LinkedList<Node>();
        //visit the root
        if(root != null) {
            current.add(root);
        }
        while(current.size() > 0) {
            result.add(current);   //adding previous level
            LinkedList<Node> parents = new LinkedList<Node>();
            current = new LinkedList<Node>();
            for(Node parent : parents) {
                if(parent.getLeftChildNode() != null) {
                    current.add(parent.getLeftChildNode());
                }
                if(parent.getRightChildNode() != null) {
                    current.add(parent.getRightChildNode());
                }
            }
        }
        return result;
    }

    //Checked if tree is balanced
    /*
    1. When we know tree is not balanced return error code
    1. We recursively get the height of left sub tree and right sub tree.
    3. If the subtree is balanced, it will return the height of the tree, if not then it will return error code.
    4. We immediately break and return code

     */
    public static int checkHeight(Node root) {
        if(root == null) {
            return -1;
        }
        int leftHeight = checkHeight(root.getLeftChildNode());
        if(leftHeight == Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        int rightHeight = checkHeight(root.getRightChildNode());
        if(rightHeight == Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        int hightDiff = leftHeight - rightHeight;
        if(Math.abs(hightDiff) > 1){
            return Integer.MIN_VALUE;
        } else
            return Math.max(leftHeight, rightHeight) + 1;
    }

    public static boolean isBalanced(Node root) {
        return checkHeight(root) != Integer.MIN_VALUE;
    }

    //Validate BST tree: Implement a function to check if binary tree is binary search tree
    public static boolean checkBST(Node root, int min, int max) {
        if(root == null) {
            return true;
        }
        if((int)root.getData() < (Integer) min|| (int)root.getData() > Integer.MAX_VALUE) {
                return false;

        } else {
            checkBST(root.getLeftChildNode(), min, (int) root
                    .getData());
            checkBST(root.getRightChildNode(), (int) root.getData(), max);
        }
        return false;
    }


    //First common ancestor or lowest common ancestor
    public static Node lCA(Node root, Node n1, Node n2) {
        if(root == null) {
            return null;
        }
        if(root == n1 || root ==n2) {
            return root;
        }
        Node left = lCA(root.getLeftChildNode(), n1, n2);
        Node right = lCA(root.getRightChildNode(), n1, n2);
        if(root.getLeftChildNode() == null && root.getRightChildNode() == null) {
            return null;
        }
        if(root.getLeftChildNode() != null || root.getRightChildNode() != null) {
            return root;

        }
        return root.getLeftChildNode() != null ? left : right;
     }

}
