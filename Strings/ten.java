package Strings;

import java.util.HashMap;
import java.util.Map;

public class ten {
    public static void main(String[] args) {

        String s = "harshad";
        Map<Character , Integer> mp = new HashMap<>();

        for(char ch : s.toCharArray()){
            mp.put(ch , mp.getOrDefault(ch , 0)+1);
        }

        for(char ch : mp.keySet()){
            System.out.println(ch + " -> " + mp.get(ch));
        }
    }
}
