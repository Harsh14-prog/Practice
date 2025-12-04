package Strings;

public class fifth {
    public static void main(String[] args) {

        String s1 = "Anagram".toLowerCase();
        String s2 = "Nagram".toLowerCase();
        
        int[] freq = new int[26];

        if(s1.length() != s2.length()) {
            System.out.println(false);
            return;
        }

        for(int i = 0 ; i < s1.length() ; i++){
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i)- 'a']--;
        }

        for(int i = 0 ; i < 26 ; i++){
            if(freq[i] != 0){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
