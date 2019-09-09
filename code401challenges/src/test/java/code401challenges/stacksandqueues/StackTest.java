package code401challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    // 1. Successfully push into a stack
    // 2. successfully push multiple values onto a stack
    // 3. Can push into a empty stack


    @Test public void pushTest () {
        Stack<Integer> newStack = new Stack<>(null);
        newStack.push(2);
        newStack.push(3);
        assertEquals("Should be same","TOP--> 3--> 2--> null" , newStack.toString());
    }

    //Test for empty stack
    //successfully instantiate an empty stack
    @Test public void pushTest_emptyStack() {
        Stack<Integer> newStack = new Stack<>(null);
        newStack.push(1);
        assertEquals("Should be same","TOP--> 1--> null" , newStack.toString());
    }

    @Test public void pushTest_forCharacter() {
        Stack<Character> newStack = new Stack<>();
        newStack.push('a');
        System.out.println(newStack.toString());
    }

    //Test for successfully pop off the stack
    @Test public void popTest() {
        Stack<Integer> newStack = new Stack<>(null);
        newStack.push(2);
        newStack.push(1);
        newStack.pop();
        assertEquals("Should be equal","TOP--> 2--> null", newStack.toString());
    }

    //successfully empty a stack after multiple pops
    @Test public void popTest_multiplePops() {
        Stack<Integer> newStack = new Stack<>(null);
        newStack.push(2);
        newStack.push(1);
        newStack.pop();
        newStack.pop();
        assertEquals("Should be equal", "TOP--> null", newStack.toString() );

    }

    //Test for successfully peek the next item on the stack
    @Test public void peekTest() {
        Stack<Integer> newStack = new Stack<>(null);
        newStack.push(2);
        newStack.push(1);
        int res = newStack.peek();
        assertEquals(1,  res);
    }

    //Test empty stack
    @Test public void peek_emptyStack() {
        Stack<Integer> newStack = new Stack<>(null);
        System.out.println(newStack.peek());
    }

    @Test public void isEmptyTest() {
        Stack<Integer> newStack = new Stack<>(null);
        assertTrue(newStack.isEmpty());
    }
    @Test public void maxTest() {
        Stack<Integer> newStack = new Stack<>(null);
        newStack.push(2);
        newStack.push(1);
        newStack.push(10);
        System.out.println(newStack.max(newStack));
    }

    @Test public void minTest() {
        Stack<Integer> newStack = new Stack<>();
        newStack.push(67);
        newStack.push(10);
        newStack.push(7);
        System.out.println(newStack.min(newStack));
    }


}