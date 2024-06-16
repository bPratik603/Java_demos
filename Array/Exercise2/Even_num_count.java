package Exercise;

import java.io.*;
public class Even_num_count {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size,count=0;
        
        System.out.println("Enter size");
        size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0;i<size;i++){
            if(arr[i] %2 == 0){
                count++;
                System.out.println(arr[i]);
            }
        }
    
        System.out.println("even num count = "+count);
    }
}
