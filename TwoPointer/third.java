package TwoPointer;

import java.util.Arrays;

public class third {
    public static void main(String[] args) {

        int[] nums = {-5, -2, -1, 10};
        int target = 1;

        Arrays.sort(nums);

        int n = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < n - 2; i++) {

            int l = i + 1;
            int h = n - 1;

            while (l < h) {

                int sum = nums[i] + nums[l] + nums[h];

                if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum;
                }

                if (sum < target) {
                    l++;
                }
                else if (sum > target) {
                    h--;
                }
                else {
                    // exact match → best possible answer
                    System.out.println(sum);
                    return;
                }
            }
        }

        System.out.println(closestSum);
    }
}
