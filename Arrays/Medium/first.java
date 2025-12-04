package Arrays.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class first {
    public static void main(String[] args) {

        int[] nums = {2,6,5,8,11};
        int n = nums.length ;
        Map <Integer , Integer> mp = new HashMap<>();

        int target = 14 ;
        List <Integer> list = new ArrayList<>();

        for(int i = 0 ; i < n ; i++){
            if(mp.containsKey(target - nums[i])){
               list.add(target-nums[i]);
               list.add(nums[i]);
               break;
            }
            else{
                mp.put(nums[i] , i);
            }
        }

        System.out.println(list);
    }
}
