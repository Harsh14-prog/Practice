package SlidingWindow;

public class maxSumWindow {
    public static void main(String[] args) {

        int[] nums = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;

        int l = 0;
        int h = k - 1;

        int windowSum = 0;

        // First window
        for (int i = l; i <= h; i++) {
            windowSum += nums[i];
        }

        int maxWindowSum = windowSum;
        int startWindow = l;

        // Slide window
        while (h < nums.length - 1) {

            // remove left
            windowSum -= nums[l];
            l++;

            // move right
            h++;
            windowSum += nums[h];

            if (windowSum > maxWindowSum) {
                maxWindowSum = windowSum;
                startWindow = l;
            }
        }

        // Output
        System.out.println("Max Sum: " + maxWindowSum);
        System.out.print("Subarray: ");
        
        for (int i = startWindow; i < startWindow + k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
