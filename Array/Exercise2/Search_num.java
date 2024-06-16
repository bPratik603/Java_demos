package Exercise;

import java.io.*;

public class Search_num {

     static int search(int arr[],int num){

        int i;
        for (i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                return i;
            }
        }

        return arr.length;
    }
    public static void main(String args[])throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size;

        System.out.println("Enter size");
        size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter number to be search");
        int num = Integer.parseInt(br.readLine());

         int sNum =  search(arr,num);

         if(sNum <arr.length){
            System.out.println(num+" found at index "+sNum);
         }else{
            System.out.println("Number not found");
         }
    }
}
