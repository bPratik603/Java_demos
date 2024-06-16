import java.io.*;

public class input_digit_count {
    public static void main(String args[])throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter 5 numbers");

        
        for(int i=1;i<=5;i++){
        
            int num = Integer.parseInt(br.readLine());
            int rem,count=0;
            while(num!=0){
               rem = num%10;
               count++;
               num = num/10;
            }

            System.out.println("digit count in num "+i+" is "+count);
        }
        
    }
}
