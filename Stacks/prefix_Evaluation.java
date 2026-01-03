package Stacks;

import java.util.Stack;

public class prefix_Evaluation {
    public static void main(String[] args) {
        
        String s = "-9/*+5346";
        int n = s.length();
        Stack<Integer> st = new Stack<>();

        for(int i = n-1 ; i >= 0 ; i--){

            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9'){
                st.push((int)ch - 48);
            }
            else{
                int v1 = st.pop();
                int v2 = st.pop();

                if(ch == '+') st.push(v1+v2);
                else if(ch == '-') st.push(v1-v2);
                else if(ch == '*') st.push(v1*v2);
                else st.push(v1/v2);
            }
        }

        System.out.println(st.peek());
    }
}
