package Arrays.Medium;

import java.util.Arrays;

public class fourth {

    public static void reverse(int[] nums , int l , int h){
        while(l < h){
            int temp = nums[l];
            nums[l] = nums[h];
            nums[h] = temp ;

            l++;
            h--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,4,2};
        int i = nums.length - 2 ;
        int n = nums.length ;

        while(i >= 0 && nums[i+1] <= nums[i]){
            i--;
        }

        if(i < 0){
            reverse(nums , 0 , n-1);
            System.out.println(Arrays.toString(nums));
            return;
        }
        
        int l = n-1 ;
        while(nums[l] <= nums[i]){
            l-- ;
        }

        int temp = nums[i];
        nums[i] = nums[l];
        nums[l] = temp ;

        reverse(nums , i+1 , n-1);

        System.out.println(Arrays.toString(nums));
    }
}
