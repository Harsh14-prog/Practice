package Arrays.Easy;


import java.util.Arrays;

public class sixth {
    public static void main(String[] args) {
        int[] nums = {0,1,0,0,0,4,0,5,0,6,0,0,7};
        int i = 0 ;
        int j = 0 ;

        while(j < nums.length){
            if(nums[j] == 0){
                j++;
            }
            else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
