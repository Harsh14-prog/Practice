package PrefixSum;

public class first {
    public static void main(String[] args) {
       int[] nums = {1,7,3,6,5,6} ;
       int n  = nums.length ;

       int left = 0 ;
       int right = 0 ;

       int sum = 0 ;
       for(int num : nums){
        sum += num ;
       }
       
       for(int i = 1 ; i < n ; i++){
         left += nums[i-1];
         right = sum - nums[i] - left ;

         if(left == right){
            System.out.println(i);
            return;
         }
       }
       System.out.println(-1);
       return;
    }
}
