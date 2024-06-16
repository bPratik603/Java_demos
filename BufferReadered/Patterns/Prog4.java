package Patterns;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prog4 {
 public static void main(String args[]) throws IOException{
      
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter start number");
    int start = Integer.parseInt(br.readLine());

    System.out.println("Enter end number");
    int ends = Integer.parseInt(br.readLine());

    for(int i=ends;i>=start;i--){
        if(i%2==0){
              System.out.print(i+" ");
        }
    }
 
     System.out.println();
    for(int j=start;j<=ends;j++){
        if(j%2==1){
            System.out.print(j+" ");
        }
    }
 }    
}
