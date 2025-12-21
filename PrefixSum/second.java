package PrefixSum;

public class second {

    // counts subarrays with sum <= k
    public static int atMost(int[] nums, int k) {

        int l = 0;
        int sum = 0;
        int count = 0;

        for (int h = 0; h < nums.length; h++) {

            sum += nums[h];

            while (sum > k) {
                sum -= nums[l];
                l++;
            }

            // IMPORTANT FIX
            // count ALL subarrays ending at h
            count += h - l + 1;
        }

        return count;
    }

    public static void main(String[] args) {

        // works ONLY for positive numbers
        int[] nums = {1, 2, 1, 1, 1, 2, 3};
        int k = 3;

        int result = atMost(nums, k) - atMost(nums, k - 1);
        System.out.println(result);
    }
}
