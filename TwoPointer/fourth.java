package TwoPointer;

import java.util.Arrays;

public class fourth {
    public static void main(String[] args) {

        long[] arr = {5, 1, 3, 4, 7};
        int n = arr.length;
        int sum = 12;

        long result = countTriplets(n, sum, arr);
        System.out.println("Number of triplets: " + result);
    }

    public static long countTriplets(int n, int sum, long[] arr) {

        Arrays.sort(arr);
        long count = 0;

        for (int i = 0; i < n - 2; i++) {

            int l = i + 1;
            int h = n - 1;

            while (l < h) {

                long currSum = arr[i] + arr[l] + arr[h];

                if (currSum < sum) {
                    // all pairs between l and h are valid , so direct count rather than doing h-- then sum then count
                    count += (h - l);
                    l++;
                } else {
                    h--;
                }
            }
        }
        return count;
    }
}
