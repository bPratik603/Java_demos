package Exercise;

import java.util.*;
public class Implementing_replace {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println("Enter replace char");
        char exCh = sc.next().charAt(0);

        System.out.println("Enter new char");
        char newCh = sc.next().charAt(0);

        char arr[] = str.toCharArray();

        for(int i=0;i<arr.length;i++){
            if(arr[i] == exCh){
                arr[i] = newCh;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
