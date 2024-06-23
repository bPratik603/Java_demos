package Exercise4;

import java.io.*;
public class Second_max_num {

    public static void main(String args[]) throws IOException{

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       System.out.println("Enter size");
       int size = Integer.parseInt(br.readLine());

       int arr[] = new int[size];

       for (int i = 0; i < arr.length; i++) {
        arr[i] = Integer.parseInt(br.readLine());
       }

       int maxNum = arr[0];
       int secondMax = arr[0];

       for (int i = 0; i < arr.length; i++) {
          if(arr[i] > maxNum){
            secondMax = maxNum;
            maxNum = arr[i];
          }
       }

       System.out.println("Second max number = "+secondMax);
    }
}
