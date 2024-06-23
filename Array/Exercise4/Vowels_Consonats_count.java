


// ------    OutPut not get as expected --------


package Exercise4;

import java.io.*;
public class Vowels_Consonats_count {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size");
        int size = Integer.parseInt(br.readLine());

        char arr[] = new char[size];

        for(int i=0;i<arr.length;i++){
            arr[i] = (char)br.read();
        }

        int vowelCnt = 0;
        int consonatCnt = 0;
        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i] == 'a' || arr[i] == 'A' || arr[i] == 'e' || arr[i] == 'E' || arr[i] == 'i' || arr[i] == 'I' ||
               arr[i] == 'o' || arr[i] == 'O' || arr[i] == 'u' || arr[i] == 'U'){
                vowelCnt++;
               }else{
                consonatCnt++;
               }
        }

        System.out.println("Number of vowels "+vowelCnt);
        System.out.println("Number of consonats "+consonatCnt);


    }
}
