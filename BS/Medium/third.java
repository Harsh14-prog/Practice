package BS.Medium;

public class third {

    public static boolean canWeShip(int[] ship, int cap, int d) {

        int load = 0;
        int days = 1;
        for (int w : ship) {

            if (load + w > cap) {
                days++;
                load = w;

                if (days > d) {
                    return false;
                }
            } 
            else {
                load += w;
            }

        }
        return true;

    }

    public static void main(String[] args) {

        int[] ship = { 3, 2, 2, 4, 1, 4 };
        int d = 3;

        int maxi = 0;
        int sum = 0;
        for (int i : ship) {
            maxi = Math.max(maxi, i);
            sum += i;
        }

        int l = maxi;
        int h = sum;
        int ans = 0;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (canWeShip(ship, mid, d)) {
                ans = mid;
                h = mid - 1;
            } 
            else {
                l = mid + 1;
            }
        }
        System.out.println(ans);

    }
}
