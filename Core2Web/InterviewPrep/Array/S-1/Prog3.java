import java.util.*;

class Prog3{
   public static void main(String[] args){

       Scanner sc  = new Scanner(System.in);
 
       System.out.println("Enter size");
       int size = sc.nextInt();

       int arr[] = new int[size];

       for(int i=0;i<size;i++){
           arr[i] = sc.nextInt();
       }

      int sum=0;
      for(int i=0;i<size;i+=2){
        sum+= arr[i];
      }

      System.out.println("sum of alternatives : "+sum);
   }
}
