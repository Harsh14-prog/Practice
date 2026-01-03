package Stacks;

import java.util.Stack;

public class postfix_Evaluation {
    public static void main(String[] args) {

        String s = "953+4*6/-";
        int n = s.length();
        Stack<Integer> st = new Stack<>();

        for(int i = 0 ; i < n ; i++){

            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9'){
                st.push((int)ch - 48);
            }
            else{
                int v2 = st.pop();
                int v1 = st.pop();

                if(ch == '+') st.push(v1+v2);
                else if(ch == '-') st.push(v1-v2);
                else if(ch == '*') st.push(v1*v2);
                else st.push(v1/v2);
            }
        }

        System.out.println(st.peek());
    }
}
