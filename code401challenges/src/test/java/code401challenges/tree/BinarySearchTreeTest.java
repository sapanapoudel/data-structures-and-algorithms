package code401challenges.tree;

import code401challenges.arraylist.BinarySearch;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

 //1. successfully instantiate an empty tree
 //2.  successfully instantiate a tree with a single root node
    @Test
    public void intantiateTree_withSingleNode() {
        BinarySearchTree intTree = new BinarySearchTree();
        intTree.add(30);
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(30);
        assertEquals(arrayList,intTree.inOrder(intTree.getRoot(), new ArrayList<>()) );
    }

    //1. Test for In-order Traverse method
    //2. Test for successfully adding a left child and right child to a single root node
@Test
    public void addTest_inorder() {
    BinarySearchTree intTree = new BinarySearchTree();
    intTree.add(30);
    intTree.add(20);
    intTree.add(40);
    intTree.add(70);
    intTree.add(60);
    intTree.add(80);

   List<Integer> arrayList = new ArrayList<>();
   arrayList.add(20);
   arrayList.add(30);
   arrayList.add(40);
   arrayList.add(60);
   arrayList.add(70);
   arrayList.add(80);
   assertEquals(arrayList,intTree.inOrder(intTree.getRoot(), new ArrayList<>()) );
   assertTrue(intTree.contain(intTree.getRoot(), 30));
   assertFalse(intTree.contain(intTree.getRoot(), 90));
}

//Test for Pre-order Traverse method and contain method
    @Test
    public void addTest_preOrder() {
        BinarySearchTree intTree = new BinarySearchTree();
        intTree.add(30);
        intTree.add(20);
        intTree.add(40);
        intTree.add(70);
        intTree.add(60);
        intTree.add(80);

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(30);
        arrayList.add(20);
        arrayList.add(40);
        arrayList.add(70);
        arrayList.add(60);
        arrayList.add(80);
        assertEquals(arrayList,intTree.preOrder(intTree.getRoot(), new ArrayList<>()) );
        assertTrue(intTree.contain(intTree.getRoot(), 30));
        assertFalse(intTree.contain(intTree.getRoot(), 90));

    }

    //Test for Post-order Traverse
    @Test
    public void addTest_postOrder() {
        BinarySearchTree intTree = new BinarySearchTree();
        intTree.add(30);
        intTree.add(20);
        intTree.add(40);
        intTree.add(70);
        intTree.add(60);
        intTree.add(80);

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(20);
        arrayList.add(60);
        arrayList.add(80);
        arrayList.add(70);
        arrayList.add(40);
        arrayList.add(30);
        assertEquals(arrayList,intTree.postOrder(intTree.getRoot(), new ArrayList<>()) );

    }

    @Test public void sumOfAllOddValue_Test(){
        BinarySearchTree tree = new BinarySearchTree();
      tree.add(3);
      tree.add(1);
      tree.add(3);
        System.out.println(tree.sumOfAllOddValue(tree.getRoot(), 0));
    }

    @Test public void compareFileTest() {
        BinarySearchTree tree1 = new BinarySearchTree();
        tree1.add(1);
        tree1.add(4);
        tree1.add(5);

        BinarySearchTree tree2 = new BinarySearchTree();
        tree2.add(6);
        tree2.add(5);
//        tree2.add(8);

        System.out.println(tree1.compareFile(tree1.getRoot(), tree2.getRoot()));

    }

}