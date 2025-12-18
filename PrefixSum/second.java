package PrefixSum ;

import java.util.HashMap;
import java.util.Map;

public class second {
    public static void main(String[] args) {

        // this sliding window approch to count subarrays with sum = k only
        // when array contains +ve numbers
        // when +ve and -ve both are there use "PrefixSum + HashMap"

        int[] nums = {1, 2, 1, 1, 1, 2, 3};
        int k = 3 ;
        
        int l = 0 ;
        int h = 0 ;
        int sum = 0 ;
        int count = 0 ;

        while (h < nums.length){
           sum += nums[h];

           while(sum == k){
              count++;
              sum -= nums[l];
              l++;
           }
           h++;
        }
        System.out.println(count);
    }
}