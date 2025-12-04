package Arrays.Easy;


import java.util.Arrays;

public class third {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6};
        int k = 2 ;
        int[] temp = new int[k];

        for(int i = 0 ; i < temp.length ; i++){
            temp[i] = nums[i];
        }

        for(int i = k ; i < nums.length ; i++){
           nums[i-k] = nums[i];
        }
        
        int j = 0 ;
        for(int i = nums.length-k ; i < nums.length ; i++){
           nums[i] = temp[j];
           j++;
        }

        System.out.println(Arrays.toString(nums));
    }
}
