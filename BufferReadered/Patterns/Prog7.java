package Patterns;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prog7 {
   public static void main(String args[]) throws IOException{
   
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     System.out.println("Enter number of row");
     int row = Integer.parseInt(br.readLine());

     int x = (row*(row+1))/2;
 
     for(int i=1;i<=row;i++){
        for(int j=1;j<=i;j++){
            if((i%2==1 && row%2==1)||(i%2==0 && row%2==0)){

                System.out.print((char)(64+x)+" ");
            }else{
                System.out.print(x+" ");
            }
            x--;
        }
        System.out.println();
     }
     
     
   }    
}
