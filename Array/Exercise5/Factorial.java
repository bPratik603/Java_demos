package Exercise5;

import java.io.*;
public class Factorial {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int fact;
        for (int i = 0; i < arr.length; i++) {
            fact=1;
             while(arr[i] != 0) {
                fact = fact * arr[i];
                arr[i]--;
            }

            System.out.print(fact+" ");
        }
    }
}
