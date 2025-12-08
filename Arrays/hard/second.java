package Arrays.hard;

import java.util.ArrayList;
import java.util.List;

public class second {
    public static void main(String[] args) {

        int[] nums = {3, -1, -7, 2, -5, 5, 0, -2, 4, 1, -3, 2};
        int n = nums.length ;
        List <List<Integer>> list = new ArrayList<>();

        for(int i = 0 ; i < n ; i++){

            if(i > 0 && nums[i] == nums[i-1]) continue ;

            int l = i+1 ;
            int h = n-1 ;

            while(l < h){
                int sum = nums[i] + nums[l] + nums[h];
                List <Integer> result = new ArrayList<>();

                if(sum == 0){

                   result.add(nums[l]);
                   result.add(nums[h]);
                   result.add(nums[i]);

                   list.add(result);

                   while(l < h && nums[l] == nums[l+1]){
                     l++ ;
                   }

                   while(l < h && nums[h] == nums[h-1]){
                      h-- ;
                   }
                   
                   l++;
                   h--;
                }

                if(sum < 0){
                    l++;
                }

                if(sum > 0){
                    h--;
                }
            }
        }

        System.out.println(list);
    }
}