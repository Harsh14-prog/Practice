package Arrays.Easy;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class eighth {
    public static void main(String[] args) {
        int[] nums = {4,3,1,1,2,5,2,5};
        int n = nums.length ;

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            if(set.contains(num)){
                set.remove(num);
            }
            else{
                set.add(num);
            }
        }

        List<Integer> list = new ArrayList<>(set);
        System.out.println(list);
    }
}
