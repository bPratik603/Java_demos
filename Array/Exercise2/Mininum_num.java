package Exercise;

import java.io.*;
public class Mininum_num {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size,tmp=0;

        System.out.println("Enter size");
        size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        tmp = arr[0];

        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i] < tmp){
                tmp = arr[i];
            }
        
        }

        System.out.println("Minimum number in the array is : "+tmp);
    }
}
