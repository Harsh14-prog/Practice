package Arrays.Easy;


import java.util.Arrays;

public class first {
    public static void main(String[] args){
        int[] arr = {1,1,1,2,2,3,3,3,3,4,4};
        int l = 0;
        int h = 1;

        while(h < arr.length){
            if(arr[l] == arr[h]){
                h++;
            }
            else{
               l++;
               arr[l] = arr[h];
               h++; 
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
