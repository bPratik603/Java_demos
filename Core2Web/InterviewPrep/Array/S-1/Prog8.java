import java.util.*;

class Prog8{
   public static void main(String[] args){
             
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter size");
       int size = sc.nextInt();

      int arr[] = new int[size];
      int arr1[] = new int[size];

       System.out.println("Enter values");
       for(int i=0;i<size;i++){
           arr[i] = sc.nextInt();
       }

      
       int j = -1;
       for(int i = 0;i<size-1;i+=2){

           if(arr[i] == arr[i]++){
               int tmp = arr[i];
               arr[i] = arr[i+1];
               arr[i+1] = tmp;
           }
       }

       for(int data : arr){
           System.out.println(data);
       }
   }
}
