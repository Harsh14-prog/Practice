package BS.Medium;

public class fourth {
    public static void main(String[] args) {

        int[] nums = {100};
        int k = 5;
        
        int l = 0 ;
        int h = nums.length - 1 ;

        while(l <= h){
            int mid = l + (h-l)/2;

            int missing = nums[mid] - (mid+1);

            if(missing < k){
                l = mid+1;
            }
            else{
                h = mid-1 ;
            }
        }

        int kthMissingNo = l + k ;

        System.out.println(kthMissingNo);
    }
}
