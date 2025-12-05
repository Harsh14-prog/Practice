package Arrays.Medium;

import java.util.ArrayList;
import java.util.List;

public class fifth {
    public static void main(String[] args) {

        int[] nums = {10,22,12,3,0,6};
        int n = nums.length ;
        List <Integer> leader = new ArrayList<>();
        
        int maxi = nums[n-1];
        leader.add(nums[n-1]);

        for(int i = n-2 ; i >= 0 ; i--){
            if(nums[i] > maxi){
                maxi = nums[i];
                leader.add(maxi);
            }
        }

        System.out.println(leader);
    }
}
