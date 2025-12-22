package MergeInterval;

import java.util.*;

public class first {
    public static void main(String[] args) {

        int[][] nums = {{1,3}, {2,6}, {8,10}, {15,18}};

        // STEP 1: Sort intervals by start
        Arrays.sort(nums, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        int start1 = nums[0][0];
        int end1 = nums[0][1];

        for (int i = 1; i < nums.length; i++) {

            int start2 = nums[i][0];
            int end2 = nums[i][1];

            if (end1 >= start2) {     // overlap → merge
                end1 = Math.max(end1, end2);
            } else {                  // no overlap → store & reset
                result.add(new int[]{start1, end1});
                start1 = start2;
                end1 = end2;
            }
        }

        // ADD LAST INTERVAL
        result.add(new int[]{start1, end1});

        // Print result
        for (int[] interval : result) {
            System.out.println(interval[0] + " " + interval[1]);
        }
    }
}
