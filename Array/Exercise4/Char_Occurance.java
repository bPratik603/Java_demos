package Exercise4;

import java.io.*;
public class Char_Occurance {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size");
        int size = Integer.parseInt(br.readLine());

        char arr[] = new char[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char)br.read();
        }

        System.out.println("Enter charactor");
        char search = (char)br.read();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
              if(arr[i] == search){
                count++;
              }
        }

        System.out.println(search+" occurs "+count+" times in the given array");
    }
}
