package string;

import java.util.Stack;

public class RevesePolishNotation {

    public static void main(String[] args) {
        String[] inputArr = {"2","1","+","3","*"};
        RevesePolishNotation rpn = new RevesePolishNotation();
        int result = rpn.evalRPN(inputArr);
        System.out.println(result);
    }

    public int evalRPN(String[] tokens) {

        if (tokens.length == 1)
            return (isInteger(tokens[0])) ? Integer.parseInt(tokens[0]) : 0;
        Stack<Integer> operandStack = new Stack<Integer>();
        for (int i = 0; i < tokens.length; i++) {
            if (isInteger(tokens[i])) {
                operandStack.push(Integer.parseInt(tokens[i]));
            } else {
                int num2 = operandStack.pop();
                int num1 = operandStack.pop();
                operandStack.push(performOperation(num1, num2, tokens[i]));
            }
        }

        return operandStack.pop();
    }

    private boolean isInteger(String token) {
        try {
            Integer.parseInt(token);
        } catch (NumberFormatException formatExc) {
            return false;
        }
        return true;
    }

    private static int performOperation(int num1, int num2, String operator) {
        int result = 0;
        if (operator.equals("/")) {
            result = num1 / num2;
        } else if (operator.equals("*")) {
            result = num1 * num2;
        } else if (operator.equals("+")) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else {
            throw new IllegalArgumentException("Invalid operator");
        }
        return result;
    }
}
