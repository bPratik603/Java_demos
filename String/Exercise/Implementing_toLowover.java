package Exercise;

import java.util.*;
public class Implementing_toLowover {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String str  = sc.next();

        char arr[] = str.toCharArray();

        for(int i=0;i<arr.length;i++){
            if(arr[i] >=65 && arr[i] <=90){
                arr[i] = (char)(arr[i]+32);
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
