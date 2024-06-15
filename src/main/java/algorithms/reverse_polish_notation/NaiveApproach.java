package algorithms.reverse_polish_notation;

import java.util.Stack;

public class NaiveApproach {


    public static void main(String[] args) {
        String [] tokens = new String [] {"2", "1", "+", "3", "*"};
        System.out.println(evalRPN(tokens)==9);
        tokens = new String[] {"4", "13", "5", "/", "+"};
        System.out.println(evalRPN(tokens)==6);

    }

    public static int evalRPN(String [] tokens) {
        String operators = "+-*/";

        Stack<String> stack = new Stack<>();

        for (String token : tokens) {
            if (!operators.contains(token)) {
                stack.push(token);
            } else {
                Integer a = Integer.valueOf(stack.pop());
                Integer b = Integer.valueOf(stack.pop());
                switch (token) {
                    case "+" -> stack.push(String.valueOf(a+b));
                    case "-" -> stack.push(String.valueOf(b-a));
                    case "*" -> stack.push(String.valueOf(a*b));
                    case "/" -> stack.push(String.valueOf(b/a));
                }
            }
        }

        return Integer.valueOf(stack.pop());
    }
}


