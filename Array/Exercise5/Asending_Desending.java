package Exercise5;

import java.io.*;
public class Asending_Desending {

    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int tmp = arr[0];
        boolean status = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > tmp){
                tmp = arr[i];
                status = true;
            }
        }

        if(status == true){
            System.out.println("array in ascending order");
        }else{
            System.out.println("array is in descending order");
        }
    }
}
