package Arrays.Easy;


import java.util.HashMap;
import java.util.Map;

public class nine {
    public static void main(String[] args) {
        int[] nums = { 10, -3, 2, -1, 5, -2, 7, -6, 3, 1, 4, -5, 2 };
        int k = 7;
        int sum = 0;
        int maxLength = 0;

        Map<Integer, Integer> mp = new HashMap<>();
        int start = -1;
        int end = -1;

        for (int i = 0; i < nums.length; i++) {

            sum = sum + nums[i];
            if (sum == k) {
                if (i + 1 > maxLength) {
                    maxLength = i + 1;
                    start = 0;
                    end = i;
                }
            }

            if (mp.containsKey(sum - k)) {
                if (i - mp.get(sum - k) > maxLength) {
                    maxLength = i - mp.get(sum - k);
                    start = mp.get(sum - k) + 1;
                    end = i;
                }
            }

            if (!mp.containsKey(sum)) {
                mp.put(sum, i);
            }
        }

        if (start != -1) {
            for (int i = start; i <= end; i++) {
                System.out.print(nums[i]);
                System.out.print(",");
            }
        }
    }
}
