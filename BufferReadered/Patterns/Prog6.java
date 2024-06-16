package Patterns;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prog6 {
   public static void main(String [] args) throws IOException{
        
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter char 1");
    char ch1 = (char)br.read();

    br.skip(2);
    System.out.println("Enter char 2");
    char ch2 = (char)br.read();

    if(ch1 == ch2){
        System.out.println("Two chars are same");
    }else{
        int diff = ch1-ch2;

        if(diff<0){
            diff = diff*(-1);
        }

        System.out.println("diff = "+diff);
    }
   }    
}
