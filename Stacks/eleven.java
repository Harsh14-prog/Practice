package Stacks;

import java.util.Stack;

// next greater element ---->> along the way (without NGE array)

public class eleven {
    public static void main(String[] args) {

         int[] nums = {2, 1, 5, 6, 3};
         int n = nums.length ;

         Stack <Integer> st =  new Stack<>();

         for(int i = 0 ; i < n ; i++){

            while(!st.isEmpty() && st.peek() <= nums[i]){
                
                int smaller = st.pop();
                System.out.println("NGE of " + smaller + " -> " + nums[i]);
            }

            st.push(nums[i]);
         }

         while(!st.isEmpty()){
            int smaller = st.pop();
            System.out.println("NGE of " + smaller + " -> " + -1);
         }
    }
}
