import java.util.*;

class Prog4{
   public static void main(String[] args){
     
       Scanner sc = new Scanner(System.in);
 
       System.out.println("Enter size");
       int size = sc.nextInt();

       int arr[] = new int[size];

       System.out.println("Enter values");
       for(int i=0;i<size;i++){
          
          arr[i] = sc.nextInt();
       }

      System.out.println("Enter Number to be count");
      int search = sc.nextInt();

      int count=0;
      for(int i=0;i<size;i++){
  
         if(arr[i] == search)
             count++;   
      }

       System.out.println(search+" occured "+count+" times");
   }
}
