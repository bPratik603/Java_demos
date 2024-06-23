package StringTokenizer;

import java.util.StringTokenizer;

public class Prog2 {
    public static void main(String args[]){

        String str = "Core2Web shashi bagal";

        StringTokenizer st = new StringTokenizer(str," ");

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken()+",");
        }


    }
}
