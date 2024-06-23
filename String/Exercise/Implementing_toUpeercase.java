package Exercise;

import java.util.Scanner;
public class Implementing_toUpeercase {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        
        char arr[] = str1.toCharArray();

        for(int i=0;i<arr.length;i++){
            if(arr[i] >= 97 && arr[i] <=122){
                arr[i] = (char)(arr[i]-32);
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
