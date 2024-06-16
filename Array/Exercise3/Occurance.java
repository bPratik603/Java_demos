package Exercise3;

import java.io.*;
public class Occurance {
    
    public static void main(String[] args) throws IOException{
    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[]{1,5,9,8,7,6};

    System.out.println("Enter Number");
    int num = Integer.parseInt(br.readLine());
    int i;
    for( i=0;i<arr.length;i++){
        if( arr[i] == num){
            break;
        }
    }

    if(i == arr.length){
        System.out.println("num "+num+" is not found in array");
    }else{
        System.out.println("num "+num+" occured at index "+i);
    }
}
}
