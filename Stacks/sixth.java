package Stacks;

import java.util.Stack;

// minimum subarray sum

public class sixth {

    public static int[] nextSmaller(int[] nums , int n){

        Stack<Integer> st = new Stack<>();
        int[] nse = new int[n];

        for(int i = n-1 ; i >= 0 ; i--){

            while(!st.isEmpty() && nums[st.peek()] >= nums[i]){
                st.pop();
            }
           
            if(st.isEmpty()){
                nse[i] = n;
            }
            else{
                nse[i] = st.peek();
            }

            st.push(i);
        }

        return nse ;
    }

    public static int[] prevSmaller(int[] nums , int n){

        Stack<Integer> st = new Stack<>();
        int[] pse = new int[n];

        for(int i = 0 ; i < n ; i++){

            while(!st.isEmpty() && nums[st.peek()] >= nums[i]){
                st.pop();
            }
           
            if(st.isEmpty()){
                pse[i] = -1;
            }
            else{
                pse[i] = st.peek();
            }

            st.push(i);
        }

        return pse ;
    }

    public static void main(String[] args) {

        int[] nums = {5,3,1,2,4};
        int n = nums.length ;

        int[] nse = nextSmaller(nums , n);
        int[] pse = prevSmaller(nums , n);

        int sum = 0 ;
        
        for(int i = 0 ; i < n ; i++){

            int left = i-pse[i];
            int right = nse[i]-i ;
            
            sum = sum + nums[i]*(left * right);
        }

        System.out.println(sum);
    }
}
