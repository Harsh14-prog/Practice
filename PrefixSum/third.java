package PrefixSum;

import java.util.HashMap;
import java.util.Map;

public class third {
    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,1,1,0,0,1,0,0,0,0};
        int n = nums.length ;

        int sum = 0 ;
        int maxLength = 0 ;

        Map <Integer , Integer> mp = new HashMap<>();

        for(int i = 0 ; i < n ; i++){

            if(nums[i] == 0){
                sum += -1 ;
            }
            if(nums[i] == 1){
                sum += 1 ;
            }

            if(sum == 0){
                maxLength = Math.max(maxLength , i+1);
            }

            if(mp.containsKey(sum-0)){
               maxLength = Math.max(maxLength , i-mp.get(sum-0));
            }

            if(!mp.containsKey(sum)){
                mp.put(sum ,i);
            }
        }
        System.out.println(maxLength);
    }
}
