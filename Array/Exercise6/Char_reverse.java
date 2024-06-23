package Exercise6;

import java.io.*;
public class Char_reverse {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size");
        int size = Integer.parseInt(br.readLine());

        char arr[] = new char[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char)br.read();
            br.skip(2);
    }

    System.out.println("Before reverse");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
    char arr1[] = new char[size];
    for (int i = 0; i < arr.length; i++) {
        arr1[size-1] = arr[i];
        size--;
    }

    System.out.println("\nafter reverse");
    for (int i = 0; i < arr1.length; i++) {
        System.out.print((char)(arr1[i]+1)+" ");
    }
}
}
