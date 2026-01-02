package Stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class tweleve {
    public static void main(String[] args) {

        int[] nums = {5, 2, 4, 3, 1};
        int n = nums.length ;

        List<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for(int i = n-1 ; i >= 0 ; i--){

            while(!st.isEmpty() && st.peek() < nums[i]){
                st.pop();
            }

            if(st.isEmpty()){
               list.add(i); 
            }

            st.push(nums[i]); 
        }

        System.out.println(list);
    }
}
