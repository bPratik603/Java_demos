package StringTokenizer;

import java.util.StringTokenizer;

public class Prog4 {
    public static void main(String[] args) {
        
        String str = "2.3 5.6 22.3";

        StringTokenizer st = new StringTokenizer(str,".");

        System.out.println(st.countTokens());
    }
}
