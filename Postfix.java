import java.util.Stack;

public class Postfix  {
    
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack< >();
        
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isDigit(c)) {
                stack.push(Character.getNumericValue(c));
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String postfixExpression = "4 5 6 +-*7";
        int result = evaluatePostfix(postfixExpression);
        System.out.println("Result of postfix expression evaluation: " + result);
    }
}