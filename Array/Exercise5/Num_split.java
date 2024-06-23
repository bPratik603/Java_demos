package Exercise5;

import java.io.*;
public class Num_split {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number");
        String str = br.readLine();
        
        int arr[] = new int[str.length()];

        for (int i = 0; i <str.length(); i++) {
             
            arr[i] = (str.charAt(i) - 47);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" , ");
        }
    }
}
