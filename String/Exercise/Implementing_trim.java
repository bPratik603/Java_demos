package Exercise;

import java.util.Scanner;
public class Implementing_trim {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        
        char arr[] = str.toCharArray();

        char tmp = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] == ' '){
                arr[i] = arr[i+1];
                break;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
