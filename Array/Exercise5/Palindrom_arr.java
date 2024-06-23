package Exercise5;

import java.io.*;
public class Palindrom_arr {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter size");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int tmp[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            
            tmp[size-1] = arr[i];
            size-=1;
        }

        boolean status = false;
        for (int i = 0; i < tmp.length; i++) {
            if(arr[i] == tmp[i]){
                status = true;
            }
        }

        if(status == true){
            System.out.println("Palindrom array");
        }else{
            System.out.println("not Palindrom array");
        }
    }
}
