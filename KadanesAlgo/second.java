package KadanesAlgo;

public class second {
    public static void main(String[] args) {
        int[] nums = {-2,3,-4};
        int n = nums.length ;

        int maxEnding = nums[0];
        int minEnding = nums[0];
        int ans = nums[0];

        for(int i = 1 ; i < n ; i++){
            int v1 = nums[i];
            int v2 = maxEnding * nums[i];
            int v3 = minEnding * nums[i];

            maxEnding = Math.max(v1, Math.max(v2,v3));
            minEnding = Math.min(v1, Math.min(v2,v3));

            // ans = Math.max(ans , Math.max(maxEnding , minEnding));
            ans = Math.max(ans , maxEnding); 
            // both upper options are correct , but in ans we store only max ans
        }

        System.out.println(ans);
    }
}
