
package TwoPointer ;

import java.util.Arrays;

public class first {
    public static void main(String[] args) {
        int[] nums = {-6,-3,3,4,5};
        int n = nums.length ;

        int[] result = new int[n];
        int l = 0 ;
        int h = n-1 ;
        int idx = n-1 ;

        while(l <= h){

            int leftsq = nums[l] * nums[l];
            int rightsq = nums[h] * nums[h];

            if(leftsq > rightsq){
               result[idx] = leftsq;
               l++;
            }
            else{
                result[idx] = rightsq;
                h--;
            }
            idx--;
        }
        System.out.println(Arrays.toString(result));
    }
}
