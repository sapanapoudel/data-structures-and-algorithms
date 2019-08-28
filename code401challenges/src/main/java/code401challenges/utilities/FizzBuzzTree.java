package code401challenges.utilities;

import code401challenges.tree.Node;
import code401challenges.tree.Tree;

public class FizzBuzzTree extends Tree{

    public FizzBuzzTree(){
        super();
    }

    public void fizzBuzzOnNode(Node<Object> current){
        if(current != null) {
            if((int)current.getData() % 3 == 0 && (int)current.getData() % 5 == 0){
                current.setData( "FizzBuzz");
            } else if((int)current.getData() % 3 == 0) {
                current.setData("Fizz");
            } else if((int)current.getData() % 5 == 0) {
                current.setData("Buzz");
            } else{
                return;
            }
            fizzBuzzOnNode(current.getLeftChildNode());
            fizzBuzzOnNode(current.getRightChildNode());
        }
    }

    public Tree<Object> fizzBuzzTree(Tree<Object> myTree){
        fizzBuzzOnNode(myTree.getRoot());
        return myTree;
    }




}
