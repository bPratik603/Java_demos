package Exercise;

import java.util.Scanner;
public class Implementing_isEmpty {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String");
        String str = sc.next();

        char arr[] = str.toCharArray();

        int i=0;
        for(i=0;i<arr.length;i++){
            if(arr[i] == ' '){
                System.out.println("String empty");
                break;
            }
        }

        if(i == arr.length){
            System.out.print(arr[i-1]);
        }

    }
}
