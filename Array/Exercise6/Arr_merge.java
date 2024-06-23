package Exercise6;

import java.io.*;
public class Arr_merge {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size of arr1");
        int size1 = Integer.parseInt(br.readLine());

        int arr1[] = new int[size1];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
        }
        
        System.out.println("Enter size of arr2");
        int size2 = Integer.parseInt(br.readLine());

        int arr2[] = new int[size2];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = Integer.parseInt(br.readLine());
        }

        int arr3[] = new int[size1+size2];

        for(int i=0;i<size1;i++){
            arr3[i] = arr1[i];
        }

        int j = size1;
        for(int i=0;i<size2;i++){
            arr3[j] = arr2[i];
            j++;
        }

        System.out.println("new array");
        for(int i=0;i<size1+size2;i++){
            System.out.println(arr3[i]+" ");
        }


    }
}
