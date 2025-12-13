package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class third {
    public static void main(String[] args) {

        String s = "aabacbebebe";
        int k = 3 ;
        int maxLength = 0;

        int l = 0 ;
        int h = 0 ;
        int n = s.length();

        Map <Character , Integer> mp = new HashMap<>();

        while (h < n){
           
            char ch = s.charAt(h);
            mp.put(ch , mp.getOrDefault(ch, 0) +1);

            while(mp.size() > k){
                // shrink
                char leftChar = s.charAt(l);
                mp.put(leftChar , mp.get(leftChar)-1);

                if(mp.get(leftChar) == 0){
                    mp.remove(leftChar);
                }
                l++;
            } // l does not move for every h like O(n^2) , so T.C = O(n)

            if(mp.size() == k){
                maxLength = Math.max(maxLength , h-l+1);
            }
            h++;
        }
        System.out.println(maxLength);
    }
}
