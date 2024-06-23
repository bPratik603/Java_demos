package Exercise6;

import java.io.*;
public class Cube {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter search element");
        int search = Integer.parseInt(br.readLine());
        
        int count = 0;
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            count=0;
            
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == search){
                    count++;
                }
            }

            if(count > 2 && arr[i] == search){
                arr[i] = arr[i] * arr[i] * arr[i];
            }

            
        }

        if(i != 0){
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
    
    }
}
