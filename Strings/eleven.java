package Strings;

import java.util.HashMap;
import java.util.Map;

public class eleven {
    public static void main(String[] args) {

        String s1 = "paper";
        String s2 = "title";
        
        if(s1.length() != s2.length()) {
            System.out.println(false);
            return;
        }

        Map <Character ,  Character> mp1 = new HashMap<>();
        Map <Character ,  Character> mp2 = new HashMap<>();

        for(int i = 0 ; i < s1.length() ; i++){

            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            if(mp1.containsKey(ch1)){
              if(mp1.get(ch1) != ch2){
                System.out.println(false);
                return;
              }
            }
            else{
                if(mp2.containsKey(ch2)){
                    if(mp2.get(ch2) != ch1){
                       System.out.println(false);
                       return;
                    }
                }
                mp1.put(ch1,ch2);
                mp2.put(ch2,ch1);
            }

        }
        System.out.println(true);
    }
}
