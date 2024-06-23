package Exercise;

import java.util.Scanner;
public class Implementing_compareTo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        int len=0;
        if(arr1.length >= arr2.length){
            len = arr1.length;
        }else{
            len = arr2.length;
        }

        boolean flag = false;
        for(int i=0;i<len;i++){
            if(arr1[i] != arr2[i]){
                 flag = true;
            }
        }

       if(flag == true){
        System.out.println("not Equal");
       }else{
        System.out.println("Equal");
       }
    }
}
