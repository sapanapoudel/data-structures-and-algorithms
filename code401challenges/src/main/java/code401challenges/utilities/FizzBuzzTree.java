package code401challenges.utilities;

import code401challenges.tree.Node;
import code401challenges.tree.Tree;

public class FizzBuzzTree<E> extends Tree<E>{

    public FizzBuzzTree(){
        super();
    }

    public void fizzBuzzOnNode(Node<E> current){
        if(current != null) {
            if((Integer)current.getData() % 3 == 0) {
                current.setData((E) "Fizz");
            } else if((Integer)current.getData() % 5 == 0) {
                current.setData((E) "Buzz");
            } else if((Integer)current.getData() % 3 == 0 && (Integer)current.getData() % 5 == 0){
                current.setData((E) "FizzBuzz");
            } else{
                return;
            }
            fizzBuzzOnNode(current.getLeftChildNode());
            fizzBuzzOnNode(current.getRightChildNode());
        }
    }

    public Tree<E> fizzBuzzTree(Tree<E> myTree){
        fizzBuzzOnNode(myTree.getRoot());
        return myTree;
    }


}
