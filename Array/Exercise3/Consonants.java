package Exercise3;

import while_For.factorial;

public class Consonants {
    
    public static void main(String[] args) {
        
    
    char arr[] = new char[]{'a','b','c','y','x','o','p'};

      for(int i=0;i<arr.length;i++){
        
        if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' ||arr[i] == 'o' || arr[i] == 'u'){

        }else{
            System.out.print(arr[i]+" ");
        }
      }

    }
}
