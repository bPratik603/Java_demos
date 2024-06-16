package Patterns;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Prog5{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter number of rows");
        int row = Integer.parseInt(br.readLine());

        int a=0,b=1;
        for(int i=1;i<=row;i++){

            for(int j=1;j<=i;j++){

                System.out.print(a +" ");
                int c = a+b;
                a = b;
                b = c;
            }
            System.out.println();

            
        }
    }
}