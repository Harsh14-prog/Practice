package Strings ;

public class sixth {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";

        if(s1.length() != s2.length()){
            System.out.println(false);
            return;
        }

        for(int i = 0 ; i < s1.length() ; i++){
            if((s1+s1).contains(s2)){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}
