package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class third {
    public static void main(String[] args) {

        int[] nums = {1,2,-3,1,-2,-3};
        int[] result = new int[nums.length];

        List <Integer> pos = new ArrayList<>();
        List <Integer> neg = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] >= 0){
                pos.add(nums[i]);
            }
            else{
                neg.add(nums[i]);
            }
        }
        
        boolean start = pos.size() >= neg.size();

        int p = 0 ;
        int n = 0 ;
        int i = 0 ;

        while (p < pos.size() && n < neg.size()){
           if(start){
             result[i] = pos.get(p);
             i++;
             p++;
           }
           else{
            result[i] = neg.get(n);
            i++;
            n++;
           }
           start = !start ;
        }

        while(p < pos.size()){
            result[i] = pos.get(p);
            p++;
            i++;
        }

        while(n < neg.size()){
            result[i] = neg.get(n);
            n++;
            i++;
        }

        System.out.println(Arrays.toString(result));
    }
}
