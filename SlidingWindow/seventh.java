package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class seventh {
    public static void main(String[] args) {

        String s = "pqpqs";
        int n = s.length();
        int k = 2;

        int l = 0;
        int h = 0;
        int count = 0;

        Map<Character, Integer> mp = new HashMap<>();

        while (h < n) {

            char ch = s.charAt(h);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);

            while (mp.size() > k) {
                char leftch = s.charAt(l);
                mp.put(leftch, mp.get(leftch) - 1);

                if (mp.get(leftch) == 0) {
                    mp.remove(leftch);
                }
                l++;
            }

            count += h - l + 1;

            h++;
        }

        System.out.println(count);
    }
}
