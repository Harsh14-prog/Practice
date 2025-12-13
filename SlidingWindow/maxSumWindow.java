package SlidingWindow;

public class maxSumWindow {
    public static void main(String[] args) {
        int[] nums = { 1, 4, 2, 10, 23, 3, 1, 0, 20 };
        int k = 4;

        int l = 0;
        int h = k - 1;

        int windowSum = 0;
        for (int i = l; i <= h; i++) {
            windowSum += nums[i];
        }

        int maxWindowSum = windowSum;

        while (h < nums.length) {

            l++;
            h++;
            
            windowSum = windowSum - nums[l-1];
            if(h > nums.length-1){
                break;
            }
            windowSum = windowSum + nums[h];
            maxWindowSum = Math.max(maxWindowSum, windowSum);
        }

        System.out.println(maxWindowSum);
    }
}
