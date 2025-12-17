package KadanesAlgo;

public class first {
    public static void main(String[] args) {

        int[] nums = {1,4,-3,6,-1};
        int bestEnding = nums[0];
        int ans = nums[0];

        for(int i = 1 ; i < nums.length ; i++){
            int v1 = bestEnding + nums[i];
            int v2 = nums[i];

            bestEnding = Math.max(v1,v2);
            ans = Math.max(ans,bestEnding);
        }
        System.out.println(ans);
    }
}
