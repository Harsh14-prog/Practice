package sort;

import java.util.Arrays;

public class first {
    public static void main(String[] args) {
        int[] nums = { 5, 1, 4, 2 };
        int n = nums.length;

        for (int i = 0; i <= n - 1; i++) {

            boolean isSwapped = false;

            for (int j = 0; j < n-i-1; j++) {

                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    isSwapped = true;
                }
            }

            if (!isSwapped) {
                break;
            }

        }

        System.out.println(Arrays.toString(nums));
    }
}
