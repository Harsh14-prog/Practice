package SlidingWindow;

public class sixth {
    public static void main(String[] args) {

        String s = "ADOBECODEBANC";
        String t = "ABC";

        int l = 0, h = 0;

        int[] need = new int[256];     // frequency of t
        int[] window = new int[256];   // frequency of window

        // fill need array
        for (int i = 0; i < t.length(); i++) {
            need[t.charAt(i)]++;
        }

        int required = t.length();
        int start = 0;
        int minLength = Integer.MAX_VALUE;

        while (h < s.length()) {

            char ch = s.charAt(h);
            window[ch]++;

            if (window[ch] <= need[ch]) {
                required--;
            }

            // shrink window
            while (required == 0) {   // got 1st correct information i.e condn

                if (h - l + 1 < minLength) {   // store ans of 1st correct condn
                    minLength = h - l + 1;     // then shrink
                    start = l;
                }
                
                // now start to shrink
                char leftChar = s.charAt(l);
                window[leftChar]--;

                if (window[leftChar] < need[leftChar]) {
                    required++;
                }

                l++;   
            }

            h++;
        }

        String result = minLength == Integer.MAX_VALUE
                        ? ""
                        : s.substring(start, start + minLength);

        System.out.println(result);
    }
}
