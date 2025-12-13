package SlidingWindow;

public class second {
    public static void main(String[] args) {
        int[] nums = {1,2,4,4};
        int targetSum = 4 ;
        int n = nums.length;

        int l = 0 ;
        int h = 0 ;
        int minLength = Integer.MAX_VALUE;

        int sum = 0 ;

        while(h < n){
            sum = sum + nums[h];

            while(sum >= targetSum){

                minLength = Math.min(minLength , h-l+1);
                sum = sum - nums[l];
                l++;
            }
            h++;
        }

        System.out.println(minLength);

    }
}
