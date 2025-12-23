package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

// SUM OF SUBARRAY RANGES -------->>>>>>

public class seventh {

    // --------- SUM OF SUBARRAY MINIMUMS ----------
    private static long sumSubarrayMin(int[] nums, int n) {

        int[] pse = new int[n];
        int[] nse = new int[n];

        Deque<Integer> st = new ArrayDeque<>();

        // Previous Smaller (strict >)
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && nums[st.peek()] > nums[i]){
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        st.clear();

        // Next Smaller (>=)
        for(int i = n - 1; i >= 0; i--){
            while(!st.isEmpty() && nums[st.peek()] >= nums[i]){
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        long sum = 0;
        for(int i = 0; i < n; i++){
            long left = i - pse[i];
            long right = nse[i] - i;
            sum += nums[i] * left * right;
        }

        return sum;
    }

    // --------- SUM OF SUBARRAY MAXIMUMS ----------
    private static long sumSubarrayMax(int[] nums, int n) {

        int[] pge = new int[n];
        int[] nge = new int[n];

        Deque<Integer> st = new ArrayDeque<>();

        // Previous Greater (strict <)
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && nums[st.peek()] < nums[i]){
                st.pop();
            }
            pge[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        st.clear();

        // Next Greater (<=)
        for(int i = n - 1; i >= 0; i--){
            while(!st.isEmpty() && nums[st.peek()] <= nums[i]){
                st.pop();
            }
            nge[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        long sum = 0;
        for(int i = 0; i < n; i++){
            long left = i - pge[i];
            long right = nge[i] - i;
            sum += nums[i] * left * right;
        }

        return sum;
    }

    // --------- SUM OF SUBARRAY RANGES ----------
    public static long subArrayRanges(int[] nums) {
        int n = nums.length;
        return sumSubarrayMax(nums, n) - sumSubarrayMin(nums, n);
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        long result = subArrayRanges(nums);

        System.out.println(result); 
    }
}
