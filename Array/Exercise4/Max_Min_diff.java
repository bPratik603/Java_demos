package Exercise4;

import java.io.*;

public class Max_Min_diff {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int maxNum = arr[0];
        int minNum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < minNum){
                minNum = arr[i];
            }

            if(arr[i] > maxNum){
                maxNum = arr[i];
            }
        }
        
        System.out.println("min number "+minNum);
        System.out.println("max number "+maxNum);
        System.out.println("The differance between Minimum and Maximum element is "+ (maxNum-minNum));
    }    
}
