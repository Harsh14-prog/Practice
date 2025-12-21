package SlidingWindow;

public class eight {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int k = 2;

        int l = 0;
        int zeros = 0;
        int maxLen = 0;

        for (int h = 0; h < nums.length; h++) {

            if (nums[h] == 0) {
                zeros++;
            }

            while (zeros > k) {
                if (nums[l] == 0) {
                    zeros--;
                }
                l++;
            }

            maxLen = Math.max(maxLen, h - l + 1);
        }

        System.out.println(maxLen);
    }
}
