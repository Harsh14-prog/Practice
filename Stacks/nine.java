package Stacks;


// trapping rain water --->>>> 2 pointer approch

public class nine {
    public static void main(String[] args) {

        int[] heights = {4,2,0,3,2,5};
        int n = heights.length ;

        int l = 0 ;
        int h = n-1 ;

        int leftMax = 0 ;
        int rightMax = 0 ;

        int water = 0 ;

        while (l < h){

            if(heights[l] <= heights[h]){

                leftMax = Math.max(leftMax , heights[l]);
                water += leftMax - heights[l];
                l++;
            }
            else{

                rightMax = Math.max(rightMax , heights[h]);
                water += rightMax - heights[h];
                h--;
            }
        }

        System.out.println(water);
    }
}
