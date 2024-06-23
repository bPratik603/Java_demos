package Exercise6;

import java.io.*;
public class ASCII_to_char {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i] >=65 && arr[i] <=91){
                System.out.print((char)arr[i]+" ");
            }else{
                System.out.print(arr[i]+" ");
            }
        }
    }
}
