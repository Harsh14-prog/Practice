package Strings;

public class third {
    public static void main(String[] args) {
        String s = "a  b cd   efg";
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) != ' '){
                sb.append(s.charAt(i));
            }
        }

        System.out.println(sb.toString());
    }
}
