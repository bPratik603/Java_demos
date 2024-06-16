

import java.io.*;

public class sumOf_fact_each_digit {
    public static void main(String args[]) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number");
        int num = Integer.parseInt(br.readLine());

        int rem,sum=0;

        while(num!=0){
            rem = num%10;
            int prod = 1;
            while(rem!=0){
                prod = prod*rem;
                rem--;
            }

            sum = sum+prod;
            num = num/10;
        }

        System.out.println("Addtion of factorial of each digit = "+sum);
    }    
}
