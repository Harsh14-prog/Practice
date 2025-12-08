package Arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class third {
    public static void main(String[] args) {

        int[] nums = { 4, 3, 3, 4, 4, 2, 1, 2, 1, 1 };
        int n = nums.length;
        int target = 9 ;

        Arrays.sort(nums);   // most imp step to detect duplicate

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            for (int j = i + 1; j < n; j++) {

                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;

                int l = j + 1;
                int h = n - 1;

                while (l < h) {
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[h];

                    if (sum == target) {
                        list.add(Arrays.asList(nums[i], nums[j], nums[l], nums[h]));

                        while (l < h && nums[l] == nums[l + 1]) {
                            l++;
                        }
                        while (l < h && nums[h] == nums[h - 1]) {
                            h--;
                        }
                        l++;
                        h--;
                    }

                    if (sum < target)
                        l++;
                    if (sum > target)
                        h--;
                }
            }
        }
        System.out.println(list);
    }
}
