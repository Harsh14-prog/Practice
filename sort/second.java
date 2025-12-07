package sort;

import java.util.Arrays;

public class second {
    public static void main(String[] args) {

        int[] nums = {5,3,6,2,4};
        int n = nums.length;

        for(int i = 0 ; i < n-1 ; i++){
            
            int minIdx = i ;
            for(int j = i+1 ; j < n ; j++){
                if(nums[j] < nums[minIdx]){
                    minIdx = j ;
                }
            }

            int temp = nums[i];
            nums[i] = nums[minIdx];
            nums[minIdx] = temp ;
        }

        System.out.println(Arrays.toString(nums));
    }
}
