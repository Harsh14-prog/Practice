package Arrays.Medium;

import java.util.HashMap;
import java.util.Map;

public class sixth {
    public static void main(String[] args) {
        int[] nums = {3,4,-7,1,3,-4,-3,2,2};
        int k = 0 ;

        Map <Integer , Integer> mp = new HashMap<>();

        int sum = 0 ;
        int count = 0 ;

        for(int i = 0 ; i < nums.length ; i++){

            sum = sum + nums[i];

            if(sum == k){
                count++;
            }

            if(mp.containsKey(sum-k)){
                count += mp.get(sum-k);
            }

            mp.put(sum , mp.getOrDefault(sum , 0)+1);
        }

        System.out.println(count);
    }
}
