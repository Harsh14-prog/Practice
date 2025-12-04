package Strings;

public class Nine {
    public static void main(String[] args) {

        String s = "abca".toLowerCase();
        boolean[] seen = new boolean[26] ;

        for(int i = 0 ; i < s.length() ; i++){
           if(seen[s.charAt(i) - 'a']){
             System.out.println(s.charAt(i));
             return;
           }
           seen[s.charAt(i) - 'a'] = true ;
        }
        System.out.println("no any repeated character exist");
    }
}
