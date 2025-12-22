package Stacks;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

// previous smaller -------------->>>>>

public class fourth {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 2, 10, 8 };
        int n = nums.length;

        int[] pse = new int[n];
        Deque<Integer> st = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            // remove all elements >= current
            while (!st.isEmpty() && st.peek() >= nums[i]) {
                st.pop();
            }

            // previous smaller
            pse[i] = st.isEmpty() ? -1 : st.peek();

            // push current
            st.push(nums[i]);
        }

        System.out.println(Arrays.toString(pse));
    }
}
