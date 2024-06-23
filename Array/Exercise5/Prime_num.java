package Exercise5;

import java.io.*;
public class Prime_num {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int count;
        for (int i = 0; i < arr.length; i++) {
            count=0;
            for (int j = 1; j <= arr[i]; j++) {
                if(arr[i]%j == 0){
                   count++;
                }
            }

            if(count == 2){
                System.out.println("Frist Prime number found at index "+i);
                break;
            }
        }
    }
}
