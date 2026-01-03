package Stacks; 

import java.util.Stack;

public class InfixEvaluation {

    static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return 0;
    }

    static int apply(int a, int b, char op) {
        if (op == '+') return a + b;
        if (op == '-') return a - b;
        if (op == '*') return a * b;
        return a / b;
    }

    public static void main(String[] args) {

        String s = "9-(5+3)*4/6";

        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // digit
            if (Character.isDigit(ch)) {
                val.push(ch - '0');
            }

            // opening bracket
            else if (ch == '(') {
                op.push(ch);
            }

            // closing bracket
            else if (ch == ')') {
                while (op.peek() != '(') {
                    int b = val.pop();
                    int a = val.pop();
                    val.push(apply(a, b, op.pop()));
                }
                op.pop(); // remove '('
            }

            // operator
            else {
                if (!op.isEmpty() && precedence(op.peek()) >= precedence(ch)) {
                    int b = val.pop();
                    int a = val.pop();
                    val.push(apply(a, b, op.pop()));
                }
                op.push(ch);
            }
        }

        // remaining operators
        while (!op.isEmpty()) {
            int b = val.pop();
            int a = val.pop();
            val.push(apply(a, b, op.pop()));
        }

        System.out.println(val.peek());
    }
}
