package Strings;

public class seventh {
    public static void main(String[] args) {
        String[] words = {"flower" , "flow" , "flight"};
        String prefix = words[0];

        for(int i = 1 ; i < words.length ; i++){
            String s = words[i];
            while(!s.startsWith(prefix)){

                prefix = prefix.substring(0 , prefix.length()-1);

                if(prefix.isEmpty()){
                    System.out.println("");
                    return;
                }
            }
        }
        System.out.println(prefix);
    }
}
