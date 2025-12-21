package SlidingWindow;

public class nine {

    // counts subarrays with at most k odd numbers
    public static int atMost(int[] nums, int k) {

        int l = 0;
        int oddCount = 0;
        int count = 0;

        for (int h = 0; h < nums.length; h++) {

            if (nums[h] % 2 != 0) {
                oddCount++;
            }

            while (oddCount > k) {
                if (nums[l] % 2 != 0) {
                    oddCount--;
                }
                l++;
            }

            // count all subarrays ending at h
            count += h - l + 1;
        }

        return count;
    }

    // exactly k odds = atMost(k) - atMost(k-1)
    public static int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 1, 1};
        int k = 3;

        System.out.println(numberOfSubarrays(nums, k)); // Output: 2
    }
}
