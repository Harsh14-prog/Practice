package Arrays.Easy;


import java.util.Arrays;

public class fourth {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int k = 2 ;
        int n = nums.length;
        int[] temp = new int[n];
        
        int j = 0 ;
        for(int i = n-k ; i < n ; i++){
           temp[j] = nums[i];
           j++;
        }

        for(int i = 0 ; i < n-k ; i++){
            temp[j] = nums[i];
            j++;
        }

        System.out.println(Arrays.toString(temp));
    }
}
