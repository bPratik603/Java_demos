package Exercise4;

import java.io.*;
public class Occurance {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter number");
        int num = Integer.parseInt(br.readLine());
        
        int i;
        int count=0;
        for (i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                count++;
            }
        }

        
        if(count == 2){
            System.out.println(num+" occurs 2 times");
        }else if(count >= 2){
            System.out.println(num+" occurs more than 2 times");
        }else if(count == 0){
            System.out.println(num+" not present in array"); 
        }
    }
}
