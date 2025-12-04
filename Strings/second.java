package Strings;

public class second {
    public static void main(String[] args) {

        String s = "A man has 2 dogs".toLowerCase();
        int vowel = 0 ;
        int consonant = 0 ;
        int digit = 0 ;
        int space = 0 ;

        String st = "aeiou";

        for(int i = 0 ; i < s.length() ; i++){

            char ch = s.charAt(i);
            if(st.contains(String.valueOf(ch))){
                vowel++;
            }
            else if(ch >= '0' && ch <= '9'){
                digit++;
            }
            else if(ch == ' '){
              space++;
            }
            else{
                consonant++;
            }
        }
        System.out.println(vowel + " " + consonant + " " + digit + " " + space);
    }
}
