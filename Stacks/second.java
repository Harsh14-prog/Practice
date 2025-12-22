package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

// valid parenthesis ---------->>>>>>>

public class second {
    public static void main(String[] args) {
        String s = "{[()]}";
        int n = s.length();

        Deque <Character> st = new ArrayDeque<>();

        for(int i = 0 ; i < n ; i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            }
            else{

                if(st.isEmpty()) {
                    System.out.println(false);
                    return;
                }

                if(st.peek() == '(' && s.charAt(i) == ')' ||
                   st.peek() == '{' && s.charAt(i) == '}' ||
                   st.peek() == '[' && s.charAt(i) == ']'
                  )
                {
                    st.pop();
                }
                else{
                    System.out.println(false);
                    return;
                }
            }
        }

        if(!st.isEmpty()){
            System.out.println(false);
            return;
        }

        System.out.println(true);
    }
}
