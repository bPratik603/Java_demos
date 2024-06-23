package Exercise;

import java.util.*;
public class Implementing_compareToEgnoreCase {
    public static void main(String args[]){

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
            
            if(arr1[i] == arr2[i]){
                     flag = true;
            }else if(arr1[i]-32 == arr2[i]){
                flag = true;
                break;
            }
        }
        

        if(flag == true){
            System.out.println("Equals");
        }else{
            System.out.println("not equal");
        }
    }
}
