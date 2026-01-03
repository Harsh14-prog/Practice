package Stacks;

import java.util.Stack;

public class prefix_to_Infix {
    public static void main(String[] args) {

        String s = "-9/*+5346";
        int n = s.length();

        Stack<String> st = new Stack<>();

        // scan from right to left
        for (int i = n - 1; i >= 0; i--) {

            char ch = s.charAt(i);

            // operand
            if (ch >= '0' && ch <= '9') {
                st.push(ch + "");
            }
            // operator
            else {
                String v1 = st.pop();
                String v2 = st.pop();

                String exp = "(" + v1 + ch + v2 + ")";
                st.push(exp);
            }
        }

        System.out.println(st.peek());
    }
}
