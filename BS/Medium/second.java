package BS.Medium;

public class second {
    public static void main(String[] args) {
        int[] nums = {8, 4, 2, 3};
        int threshold = 10 ;

        int l = 1 ;
        int maxi = 0 ;

        for (int i : nums){
            maxi = Math.max(maxi , i);
        }

        int h = maxi ;
        int ans = 0 ;

        while(l <= h){
          
            int mid = l + (h-l)/2 ;

            int total_sum = 0 ;
            for(int i : nums){
                total_sum += (int)Math.ceil((double)i/mid);
            }

            if(total_sum > threshold){
                l = mid + 1 ;
            }
            else{
               ans = mid ;
               h = mid - 1 ;
            }
        }
        System.out.println(ans);

    }
}
