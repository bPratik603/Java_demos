package Exercise;

import java.util.Scanner;
public class CompareStr {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        int len =0;
        if(arr1.length >= arr2.length){
            len = arr1.length;
        }else{
            len = arr2.length;
        }

        int arr1Count=0;
        int arr2Count=0;
        boolean flag = true;
        for(int i=0;i<len;i++){
            if(i < arr1.length && i< arr2.length){
                if(arr1[i] != arr2[i]){
                    System.out.println(arr1[i] - arr2[i]);
                    flag = false;
                }
            }else if(i == arr1.length){
                arr1Count = arr1.length - arr2Count;
            }else if(i == arr2.length){
                arr2Count = arr2.length - arr1.length;
            }
        }

       if(arr1Count != 0){
        System.out.println(arr1Count);
       }else if(arr2Count != 0){
        System.out.println(arr2Count);
       }else if(arr1.length == arr1.length && flag){
        System.out.println("0");
       }
    }
}
