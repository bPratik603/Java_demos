package StringTokenizer;

import java.util.StringTokenizer;

public class Prog3 {
    public static void main(String[] args) {
        
        String str = "true false";

        StringTokenizer st = new StringTokenizer(str," ");

        while(st.hasMoreTokens()){
            boolean b = Boolean.parseBoolean(st.nextToken());
            System.out.println(b);
        }

        
    }
}
