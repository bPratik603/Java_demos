package Exercise4;

import java.io.*;
public class Reverse {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];
        int tmpArr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
 
        for (int i = 0; i < arr.length; i++) {
           
           tmpArr[size-1] = arr[i];
           size-=1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(tmpArr[i]);
        }

    }
}
