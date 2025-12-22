package Stacks;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

// next greater element

public class third {
    public static void main(String[] args) {
        int[] nums = {4,5,2,10,8};
        int n = nums.length ;

        Deque<Integer> st = new ArrayDeque<>();

        int[] nge = new int[n];

        for(int i = n-1 ; i >= 0 ; i--){

            while(!st.isEmpty() && st.peek() <= nums[i]){
                st.pop();
            }

            if(st.isEmpty()){
                nge[i] = -1 ;
            }
            else{
               nge[i] = st.peek();
            }
            st.push(nums[i]);
        }

        System.out.println(Arrays.toString(nge));
    }
}
