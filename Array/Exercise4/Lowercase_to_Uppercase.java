package Exercise4;

import java.io.*;

public class Lowercase_to_Uppercase {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size");
        int size = Integer.parseInt(br.readLine());

        char arr[] = new char[size];

        for(int i=0;i<arr.length;i++){
            arr[i] = (char)br.read();
        }

        for(char ch : arr){
            System.out.println(Character.toUpperCase(ch));
        }


    }
}
