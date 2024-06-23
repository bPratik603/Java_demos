package Exercise5;

import java.io.*;
public class Count_digit_in_number {
    
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < arr.length; i++) {
            int rem,tmp = arr[i],count=0;

            while(tmp != 0){
                rem = tmp %10;
                count++;
                tmp/=10;
            }

            System.out.print(count+" ");

        }
    }
}
