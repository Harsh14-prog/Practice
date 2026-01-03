package Stacks;

import java.util.Stack;

public class postfix_to_prefix {
    public static void main(String[] args) {

        String s = "953+4*6/-";
        int n = s.length();

        Stack<String> st = new Stack<>();

        // scan left to right
        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            // operand
            if (ch >= '0' && ch <= '9') {
                st.push(ch + "");
            }
            // operator
            else {
                String v2 = st.pop();
                String v1 = st.pop();

                String exp = ch + v1 + v2;
                st.push(exp);
            }
        }

        System.out.println(st.peek());
    }
}
