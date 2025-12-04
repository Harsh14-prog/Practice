package Strings;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        
        sc.close();
        int n = s.length();

        StringBuilder sb = new StringBuilder();
        for(int i = n-1 ; i >= 0 ; i--){
            sb.append(s.charAt(i));
        }

        String st = sb.toString();

        if(st.equals(s)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
