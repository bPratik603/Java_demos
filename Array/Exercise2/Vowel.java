package Exercise;


import java.io.*;
public class Vowel {
    
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size,count=0;

        System.out.println("Enter size");
        size = Integer.parseInt(br.readLine());

        char arr[] = new char[size];

        for(int i=0;i<size;i++){
            arr[i] = (char)br.read();
        }

        for(int i=0;i<size;i++){

            if(arr[i] == 'a' || arr[i] == 'A' || arr[i] == 'e' || arr[i] == 'E' || arr[i] == 'i' || arr[i] == 'I' ||
               arr[i] == 'o' || arr[i] == 'O' || arr[i] == 'u' || arr[i] == 'U'){

                System.out.println("vowel "+arr[i]+" found at index "+i);
            }
        }
    }
}
