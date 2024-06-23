package Exercise5;

import java.io.*;
public class Second_min_num {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int min = arr[0];
        int secondMin = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                secondMin = min;
                min = arr[i];
            }
        }

        System.out.println("Second minimum number is "+secondMin);
    }
}
