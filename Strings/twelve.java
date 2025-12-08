package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class twelve {
    public static void main(String[] args) {

        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

        Map< String, List<String> > mp = new HashMap<>();

        for (String st : words) {

            int[] freq = new int[26];
            for (char ch : st.toLowerCase().toCharArray()) {
                freq[ch - 'a']++;
            }

            // Create key from all 26 characters
            StringBuilder sb = new StringBuilder();
            for (int f : freq) {
                sb.append(f).append('#');  // append all frequencies, including zero
            }

            String key = sb.toString();

            if(!mp.containsKey(key)){
                mp.put(key , new ArrayList<>());
            }
            mp.get(key).add(st);
        }

        System.out.println(mp.values());
    }
}
