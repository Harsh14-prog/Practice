package KadanesAlgo;

public class third {
    public static void main(String[] args) {

        int[] arr = {1, -2, 0, 3};

        int noDelete = arr[0];   // max subarray sum ending here (no deletion)
        int oneDelete = 0;       // max subarray sum ending here (one deletion used)
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {

            // Case 1: delete current element
            // Case 2: already deleted earlier, keep adding
            oneDelete = Math.max(noDelete, oneDelete + arr[i]);

            // Normal Kadane (no deletion)
            noDelete = Math.max(arr[i], noDelete + arr[i]);

            // Track best answer
            ans = Math.max(ans, Math.max(noDelete, oneDelete));
        }

        System.out.println(ans); // Expected output: 4
    }
}
