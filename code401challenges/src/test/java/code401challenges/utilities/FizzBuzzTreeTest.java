package code401challenges.utilities;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {
    @Test
    public void fizzBuzzTreeTest() {
        FizzBuzzTree fizzBuzzTree = new FizzBuzzTree();
       fizzBuzzTree.addAtNextOpenSpot(5);
       fizzBuzzTree.addAtNextOpenSpot(3);
       fizzBuzzTree.addAtNextOpenSpot(10);
       fizzBuzzTree.addAtNextOpenSpot(7);
       fizzBuzzTree.addAtNextOpenSpot(15);
       fizzBuzzTree.fizzBuzzTree(fizzBuzzTree);

       List<Object> arrayList = new ArrayList<>();
       arrayList.add(7);
       arrayList.add("Fizz");
       arrayList.add("FizzBuzz");
       arrayList.add("Buzz");
       arrayList.add("Buzz");

       assertEquals(arrayList.toString(), fizzBuzzTree.print(fizzBuzzTree.getRoot()));

    }

}