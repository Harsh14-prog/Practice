package BS.Medium;

public class first {
    public static void main(String[] args) {

        int[] piles = { 3, 6, 7, 11 };
        int H = 8;

        int l = 1;
        int high = 0;

        // find max pile (upper bound for K)
        for (int p : piles) {
            high = Math.max(high, p);
        }

        int h = high;
        int ans = 0 ;

        while (l <= h){
            int mid = l + (h-l)/2 ;

            int total_hr = 0 ;
            for(int p : piles){
                total_hr += (int)Math.ceil((double)p/mid);
            }

            if(total_hr > H){
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
