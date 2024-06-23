package algorithms.leet_code;

import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        String input = "(]";
        System.out.println(isValid(input)==false);
        input = "()[]{}";
        System.out.println(isValid(input)==true);
        input = "{[]}";
        System.out.println(isValid(input)==true);
    }

    private static boolean isValid(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c: input.toCharArray()) {
            if(c=='(') {
                stack.push(')');
            } else if(c=='[') {
                stack.push(']');
            } else if(c=='{') {
                stack.push('}');
            } else if(stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
