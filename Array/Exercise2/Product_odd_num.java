package Exercise;

import java.io.*;

public class Product_odd_num {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size,num,prod=1;

        System.out.println("Enter size");
        size = Integer.parseInt(br.readLine());
        
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < arr.length; i++) {
            
            if(i%2==1){
                prod=prod*arr[i];
            }
        }

        System.out.println("Sum of odd indexed elements: "+prod);
    }
}
