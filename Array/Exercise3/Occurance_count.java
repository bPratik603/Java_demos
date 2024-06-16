package Exercise3;

import java.io.*;
public class Occurance_count {
    
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[]{2,5,2,7,8,9,2};

        System.out.println("Enter number");
        int num = Integer.parseInt(br.readLine());

        int count=0;
        int i;
        for (i = 0; i < arr.length; i++) {
            
            if(arr[i] == num){
                count++;
            }
        }

        if(count>0){
            System.out.println("num "+num+" occured "+count+" time in array");
           
        }else
        System.out.println("num "+num+" is not found in array");
    }
}
