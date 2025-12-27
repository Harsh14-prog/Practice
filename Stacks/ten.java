package Stacks;

import java.util.Stack;


// Remove k Digits --------------

public class ten {
    public static void main(String[] args) {
        String s = "10200";
        int k = 1 ;

        int n = s.length();

        Stack <Character> st = new Stack<>();

        for( int i = 0 ; i < n ; i++){

            char ch = s.charAt(i);

            while(!st.isEmpty() && k != 0 && st.peek() > ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }

        while (k != 0){
            st.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){
            sb.append(st.peek());
            st.pop();
        }

        String str = sb.reverse().toString();

        int idx = 0 ;

        while(idx < str.length() && str.charAt(idx) == '0'){
            idx++;
        }

        str = str.substring(idx);

       // handle empty result
        System.out.println(str.length() == 0 ? "0" : str);
    }
}
