package code401challenges.utilities;

import code401challenges.stacksandqueues.Stack;

public class MultiBracketValidation {

    public static boolean isMatchingBracket(Character character1, Character character2) {
        if(character1 == '(' && character2 == ')') {
            return true;
        }
        else if(character1 == '{' && character2 == '}' ) {
            return  true;
        } else if(character1 == '[' && character2 == ']') {
            return true;
        } else {
            return false;
        }
    }

    public static boolean multiBracketValidation(String input) {
        Stack<Character> newStack = new Stack<>();
        for(int i =0; i< input.length(); i++) {
            if(input.charAt(i) == '(' || input.charAt(i) == '{' || input.charAt(i) == '[' ) {
                System.out.println(input.charAt(i));
                newStack.push(input.charAt(i));
                System.out.println(newStack.toString());
            }
            if(input.charAt(i) == ')' || input.charAt(i) == '}' || input.charAt(i) == ']') {
                if(newStack.isEmpty()){
                    return false;
                } else if(!isMatchingBracket(newStack.pop(), input.charAt(i))) {
                    return false;
                }
            }

        }
        return true;
    }

}
