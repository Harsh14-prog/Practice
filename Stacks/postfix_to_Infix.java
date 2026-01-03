package Stacks;

import java.util.Stack;

public class postfix_to_Infix {
    public static void main(String[] args) {

        String s = "953+4*6/-";
        int n = s.length();

        Stack<String> st = new Stack<>();

        for(int i = 0 ; i < n ; i++){

            char ch = s.charAt(i);

            if(ch >= '0' && ch <= '9'){
                st.push(String.valueOf(ch));
            }
            else{

                String v2 = st.pop();
                String v1 = st.pop();

                String exp = "(" + v1 + ch + v2 + ")";
                st.push( exp );
            }
        }

        System.out.println(st.peek());
    }
}
