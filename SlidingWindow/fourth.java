package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class fourth {
    public static void main(String[] args) {

        String s = "abcabcbb";

        int n = s.length();
        int l = 0, h = 0;
        int maxLen = 0;

        Map<Character, Integer> mp = new HashMap<>();

        while (h < n) {

            char ch = s.charAt(h);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);

            // shrink while duplicate exists
            while ((h - l + 1) > mp.size()) {
                char leftCh = s.charAt(l);
                mp.put(leftCh, mp.get(leftCh) - 1);

                if (mp.get(leftCh) == 0) {
                    mp.remove(leftCh);
                }
                l++;
            }

            // valid window: all characters unique
            maxLen = Math.max(maxLen, h - l + 1);

            h++; 
        }

        System.out.println(maxLen);
    }
}
