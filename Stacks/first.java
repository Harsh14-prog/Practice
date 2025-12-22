package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

// 1047. Remove All Adjacent Duplicates In String

public class first {
    public static void main(String[] args) {

        String s = "abbbbaca";
        int n = s.length();

        Deque<Character> st = new ArrayDeque<>();

        for(int i = 0 ; i < n ; i++){
            if(!st.isEmpty() && s.charAt(i) == st.peek()){
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        System.out.println(sb.reverse().toString());
    }
}
