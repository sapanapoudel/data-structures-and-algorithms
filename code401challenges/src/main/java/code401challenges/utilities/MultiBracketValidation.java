package code401challenges.utilities;


import code401challenges.stacksandqueues.Stack;

public class MultiBracketValidation {

    private static  boolean isMatchingBracket(char character1, char character2) {
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
                newStack.push(input.charAt(i));
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
