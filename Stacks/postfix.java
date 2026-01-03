package Stacks;

import java.util.Stack;

public class postfix {

    public static int precendance(char ch) {
        if (ch == '*' || ch == '/')
            return 2;
        if (ch == '+' || ch == '-')
            return 1;
        return 0;
    }

    public static void main(String[] args) {

        String s = "9-(5+3)*4/6";
        int n = s.length();

        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            if (ch >= '0' && ch <= '9') {
                val.push(String.valueOf(ch));
            } 
            else if (ch == '(') {
                op.push(ch);
            } 
            else if (ch == ')') {

                while (op.peek() != '(') {
                    // work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char c = op.pop();

                    StringBuilder sb = new StringBuilder();
                    sb.append(v1).append(v2).append(c);
                    val.push(sb.toString());
                }

                op.pop();

            } else {

                while (!op.isEmpty() && precendance(op.peek()) >= precendance(ch)) {
                    // work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char c = op.pop();

                    StringBuilder sb = new StringBuilder();
                    sb.append(v1).append(v2).append(c);
                    val.push(sb.toString());
                }

                op.push(ch); // op.peek() == '(' || !op.isEmpty() will be handled from here
            }
        }

        while (!op.isEmpty()) {
            // work
            String v2 = val.pop();
            String v1 = val.pop();
            char c = op.pop();

            StringBuilder sb = new StringBuilder();
            sb.append(v1).append(v2).append(c);
            val.push(sb.toString());
        }

        System.out.println(val.peek());
    }

}
