import java.util.*;

class Prog10{
   public static void main(String[] args){
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter size");
      int size = sc.nextInt();

      int arr[] = new int[size];
      int new_arr[] = new int[size-1];

      System.out.println("Enter values");
      for(int i=0;i<size;i++){
        arr[i] = sc.nextInt();
      }

      System.out.println("Enter vlaue to be deleted");
      int dValue = sc.nextInt();

      for(int i=0,k=0;i<size;i++){
         
         if(arr[i] != dValue){
             new_arr[k] = arr[i];
             k++;
         }
      }      

     for(int i=0;i<size-1;i++){
         System.out.println(new_arr[i]);
      }
   } 
} 
