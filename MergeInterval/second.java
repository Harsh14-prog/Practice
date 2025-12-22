package MergeInterval;

import java.util.ArrayList;
import java.util.List;

public class second {

    // -------- mergeInterval (UNION helper) ----------
    public static int[][] mergeInterval(int[][] newArr){

        List<int[]> list = new ArrayList<>();

        int s1 = newArr[0][0];
        int e1 = newArr[0][1];

        for(int i = 1 ; i < newArr.length ; i++){

            int s2 = newArr[i][0];
            int e2 = newArr[i][1];

            if(e1 >= s2){
                e1 = Math.max(e1, e2);
            }
            else{
                list.add(new int[]{s1, e1});
                s1 = s2;
                e1 = e2;
            }
        }

        list.add(new int[]{s1, e1});

        int[][] result = new int[list.size()][2];
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }

    // -------- UNION of two interval lists ----------
    public static int[][] intervalIntersection(int[][] firstList, int[][] secondList) {

        int l = 0;
        int h = 0;

        List<int[]> list = new ArrayList<>();

        while(l < firstList.length && h < secondList.length){
            if(firstList[l][0] <= secondList[h][0]){
                list.add(firstList[l]);
                l++;
            } else {
                list.add(secondList[h]);
                h++;
            }
        }

        while(l < firstList.length){
            list.add(firstList[l]);
            l++;
        }

        while(h < secondList.length){
            list.add(secondList[h]);
            h++;
        }

        int[][] result = new int[list.size()][2];
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }

        return mergeInterval(result);
    }

    // -------- main ----------
    public static void main(String[] args) {

        int[][] firstList = {{1,3},{5,7},{9,12}};
        int[][] secondList = {{2,4},{6,8},{10,11}};

        int[][] ans = intervalIntersection(firstList, secondList);

        for(int[] interval : ans){
            System.out.println(interval[0] + " " + interval[1]);
        }
    }
}
