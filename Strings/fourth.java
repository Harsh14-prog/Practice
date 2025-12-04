package Strings;

public class fourth {
    public static void main(String[] args) {
        String s = "aaHarSHA12@";

        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()) {
            if(ch >= 'A' && ch <= 'Z') {
                sb.append((char)(ch + 32));
            } else if(ch >= 'a' && ch <= 'z') {
                sb.append((char)(ch - 32));
            } else {
                sb.append(ch); 
            }
        }

        System.out.println(sb.toString());
    }
}
