package Exercise;

import java.io.*;
public class Print_odd_index_element {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println();
        for(int i=0;i<arr.length;i++){
            
            if(i%2==1){
                System.out.println("odd index element");
                System.out.println(arr[i]);
            }
        }
    }
}
