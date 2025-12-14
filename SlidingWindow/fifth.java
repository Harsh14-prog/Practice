package SlidingWindow;

public class fifth {
    public static void main(String[] args) {

        String s = "AABABBA";
        int k = 1;
        int n = s.length();

        int l = 0, h = 0;
        int maxLength = 0;

        int[] freq = new int[26];
        int maxFreq = 0;

        while (h < n) {

            char ch = s.charAt(h);
            freq[ch - 'A']++;
            maxFreq = Math.max(maxFreq, freq[ch - 'A']);

            // shrink window if replacements needed > k
            while ((h - l + 1) - maxFreq > k) {
                char leftChar = s.charAt(l);
                freq[leftChar - 'A']--;
                l++;
            }

            maxLength = Math.max(maxLength, h - l + 1);
            h++;
        }

        System.out.println(maxLength);
    }
}
