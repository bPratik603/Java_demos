package Exercise;

import java.io.*;
public class Max_num {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max,size;

        System.out.println("Enter size");
        size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        max = arr[0];

        for (int i = 0; i < arr.length; i++) {
               
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("max number is "+max);
    }
}
