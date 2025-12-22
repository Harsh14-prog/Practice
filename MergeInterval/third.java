package MergeInterval;

import java.util.Arrays;

public class third {
    public static void main(String[] args) {

        int[][] interval = {{1,10}, {2,7}, {3,5}, {6,8}};
        int[] start = new int[interval.length];
        int[] end = new int[interval.length];

        for(int i = 0 ; i < interval.length ; i++){
            start[i] = interval[i][0];
            end[i] = interval[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int room = 0 ;

        int l = 0 ;
        int h = 0 ;

        int maxRoom = Integer.MIN_VALUE;

        while (l < start.length && h < end.length){

            if(start[l] < end[h]){
               room++;
               maxRoom = Math.max(maxRoom,room);
               l++;
            }
            else{
                room--;
                maxRoom = Math.max(maxRoom,room);
                h++;
            }
        }

        System.out.println(maxRoom);
    }
}
