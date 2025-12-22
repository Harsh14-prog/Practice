package MergeInterval;

import java.util.Arrays;

public class fourth {
    public static void main(String[] args) {

        int[][] meetings = {{1,2}, {3,4}, {5,6}};

        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);

        int e1 = meetings[0][1];

        for(int i = 1; i < meetings.length; i++){
            int s2 = meetings[i][0];
            int e2 = meetings[i][1];

            if(e1 > s2){   // ✅ FIX HERE
                System.out.println(false);
                return;
            }
            e1 = e2;
        }
        System.out.println(true);
    }
}
