package Arrays.hard;

import java.util.ArrayList;
import java.util.List;

public class first {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 1, 3, 2, 2};
        int n = nums.length ;

        int ele1 = 0 ;
        int ele2 = 0 ;
        int count1 = 0 ;
        int count2 = 0 ;

        for(int i = 0 ; i < nums.length ; i++){

            if(count1 == 0 && nums[i] != ele2){
               ele1 = nums[i];
            }
            if(count2 == 0 && nums[i] != ele1){
               ele2 = nums[i];
            }

            if(ele1 == nums[i]){
                count1++;
            }
            if(ele2 == nums[i]){
                count2++;
            }
        }

        count1 = 0 ;
        count2 = 0 ;

        for(int i = 0 ; i < n ; i++){
            if(nums[i] == ele1){
                count1++;
            }
            if(nums[i] == ele2){
                count2++;
            }
        }

        List<Integer> list = new ArrayList<>();

        if(count1 > n/3){
            list.add(ele1);
        }
        if(count2 > n/3){
            list.add(ele2);
        }

        System.out.println(list);
    }
}
