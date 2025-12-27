package Stacks;


// trapping rain water ------------>>> 

public class eighth {

     
    public static void main(String[] args) {

        int[] height = {4,2,0,3,2,5};
        int n = height.length ;
        int sum = 0 ;


        int[] maxLeft = new int[n];
        int[] maxRight = new int[n];

        // -------- build maxLeft --------
        maxLeft[0] = height[0];

        for (int i = 1; i < n; i++) {
           maxLeft[i] = Math.max(maxLeft[i - 1], height[i]);
        }

        // -------- build maxRight --------
        maxRight[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], height[i]);
        }

        for(int i = 0 ; i < n ; i++){
            sum = sum + Math.min(maxLeft[i] , maxRight[i]) - height[i];
        }

        System.out.println(sum);
    }
}
