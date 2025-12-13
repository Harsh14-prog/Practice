package Arrays.hard;

import java.util.ArrayList;
import java.util.List;

public class fifth {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 6, 7, 5, 7};
        int n = nums.length;

        List <Integer> list = new ArrayList<>();
        int[] freq = new int[n+1];

        for(int num : nums){
            freq[num]++;
        }

        int remaining = -1 ;
        int duplicate = -1 ;

        for(int i = 1 ; i < freq.length ; i++){
           
            if(freq[i] == 0){
                remaining = i ;
            }

            if(freq[i] >= 2){
                duplicate = i ;
            }
        }

        System.out.println("remaining : " + remaining + ", duplicate : " + duplicate  );
    }
}
