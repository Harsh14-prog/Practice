package Stacks;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;


// next greater element in cicular array

public class fifth {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,3};
        int n = nums.length;
        int[] nge = new int[n];

        Deque<Integer> st = new ArrayDeque<>(); // stores values

        // traverse array twice (simulate circular)
        for(int i = 2*n - 1; i >= 0; i--){

            int idx = i % n;

            // remove all smaller or equal elements
            while(!st.isEmpty() && st.peek() <= nums[idx]){
                st.pop();
            }

            // fill answer only in first pass
            if(i < n){
                nge[idx] = st.isEmpty() ? -1 : st.peek();
            }

            // push current value
            st.push(nums[idx]);
        }

        // ✅ correct output
        System.out.println(Arrays.toString(nge));
    }
}
