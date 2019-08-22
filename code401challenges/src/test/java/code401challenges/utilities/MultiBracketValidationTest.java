package code401challenges.utilities;

import code401challenges.stacksandqueues.Stack;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {
    @Test
    public void adTest() {
        Stack<Character> stack = new Stack<>();
        System.out.println(MultiBracketValidation.multiBracketValidation("{[sapana}"));

    }

}