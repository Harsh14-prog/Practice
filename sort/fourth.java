package sort;

import java.util.Arrays;

public class fourth {

    public static void merge(int[] nums, int st, int end, int mid) {

        int l = st;
        int h = mid + 1;
        int k = 0;

        int[] temp = new int[end-st+1];

        while (l <= mid && h <= end) {
            if (nums[l] <= nums[h]) {
                temp[k] = nums[l];
                k++;
                l++;
            } else {
                temp[k] = nums[h];
                h++;
                k++;
            }
        }

        while (l <= mid) {
            temp[k++] = nums[l++];
        }

        while (h <= end) {
            temp[k++] = nums[h++];
        }

        // copy from temp to original
        for (int i = 0; i < temp.length; i++) {
            nums[i + st] = temp[i];
        }
    }

    public static void mergeSort(int[] nums, int st, int end) {

        if (st < end) {

            int mid = st + (end - st) / 2;

            mergeSort(nums, st, mid);
            mergeSort(nums, mid + 1, end);

            merge(nums, st, end, mid);
        }
    }

    public static void main(String[] args) {
        int[] nums = { 12, 31, 35, 8, 32, 17 };
        int n = nums.length ;

        mergeSort(nums, 0, n-1);

        System.out.println(Arrays.toString(nums));
    }
}
