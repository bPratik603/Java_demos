package Exercise6;

import java.io.*;
public class Multiple_of_num {
    public static void main(String args[]) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[]{5,10,16,20,25,30,35,4,8,12,16,20};

        System.out.println("Enter key");
        int key = Integer.parseInt(br.readLine());

        boolean flag = false;
        for(int j=0;j<arr.length;j++){
        
            if(arr[j]==key){
                flag = true;
            }
        }

        if(flag == true){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%key==0){
                System.out.println("An element multiple of "+key+" found at index "+i);
            }
        }
    }else{
        System.out.println("element not found in array");
    }
    
    }
}

