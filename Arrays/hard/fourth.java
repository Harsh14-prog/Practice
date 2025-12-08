package Arrays.hard;

import java.util.HashMap;
import java.util.Map;

public class fourth {
    public static void main(String[] args) {

        int[] nums = { 6, -2, 2, -8, 1, 7, 4, -10 };
        int n = nums.length;

        Map<Integer, Integer> mp = new HashMap<>();
        int sum = 0;
        int maxLength = 0;

        int start = -1;
        int end = -1;

        for (int i = 0; i < n; i++) {

            sum = sum + nums[i];

            if (sum == 0) {

                int length = i + 1;
                if (length > maxLength) {
                    maxLength = length;
                    start = 0;
                    end = i;
                }
            }

            if (mp.containsKey(sum)) {
                if (i - mp.get(sum) > maxLength) {
                    maxLength = i - mp.get(sum);
                    start = mp.get(sum) + 1;
                    end = i;
                }
            }

            if (!mp.containsKey(sum)) {
                mp.put(sum, i);
            }
        }

        System.out.println(maxLength);

        for (int i = start; i <= end; i++) {
            System.out.print( + nums[i] + " ,");
        }
    }
}
