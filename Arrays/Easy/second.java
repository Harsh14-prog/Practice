package Arrays.Easy;


import java.util.Arrays;

public class second {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int num = arr[0];

        for (int i = 1; i < arr.length; i++) {
           arr[i-1] = arr[i];
        }

        arr[arr.length-1] = num ;

        System.out.println(Arrays.toString(arr));
    }
}
