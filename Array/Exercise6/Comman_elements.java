package Exercise6;

import java.io.*;
public class Comman_elements {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size");
        int size = Integer.parseInt(br.readLine());

        int arr1[] = new int[size];
        int arr2[] = new int[size];

        System.out.println("Enter values for arr1");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter values for arr2");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(br.readLine());
        }

        System.out.print("Comman elements in given arrays are ");
        for (int i = 0; i < size; i++) {
            for(int j=0;j < size;j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i]+" ");
                }
            }
        }
    }
}
