package PrefixSum;

import java.util.HashMap;
import java.util.Map;

public class Fourth {
    public static void main(String[] args) {

        int[] nums = {1,1,2,1,1};
        int k = 3 ;

        int oddCount = 0 ;
        int sum = 0 ;

        Map <Integer , Integer> mp = new HashMap<>();
        mp.put(0,1);

        for(int num : nums){

            if(num % 2 != 0){
                sum = sum + (1);    // odd number mapped to 1 and 0 to 0
            }
            
            if(mp.containsKey(sum-k)){
                oddCount += mp.get(sum-k);
            }

            mp.put(sum , mp.getOrDefault(sum,0)+1);

        }
        System.out.println(oddCount);
    }
}
