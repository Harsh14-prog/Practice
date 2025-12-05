package Arrays.Medium;

public class second {
    public static void main(String[] args) {

        int[] nums = {2,3,5,-2,7,4};
        int maxSum = Integer.MIN_VALUE ;

        int sum = 0 ;
        int start = 0 ;
        int end = 0 ;
        int currStart = 0 ;

        for(int i = 0 ; i < nums.length ; i++){

            sum = sum + nums[i];

            if(sum > maxSum){
              maxSum = sum ;
              start = currStart ;
              end = i ;
            }

            if(sum < 0){
                sum = 0 ;
                currStart = i+1;
            }
        }

        System.out.println(maxSum);
        System.out.println("max sum subArray is : ");
        for(int i = start ; i <= end ; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
