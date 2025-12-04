package Arrays.Easy;


import java.util.Arrays;

public class fifth {

    public static void reverse(int[] nums, int l, int h) {
        while (l < h) {
            int temp = nums[l];
            nums[l] = nums[h];
            nums[h] = temp;
            l++;
            h--;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        int n = nums.length;
        int k = 9;

        k = k % n ;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k + 1, n - 1);

        System.out.println(Arrays.toString(nums));
    }
}
