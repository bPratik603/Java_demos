import java.util.*;

class Prog7{
   public static void main(String[] args){
      
      Scanner sc  = new Scanner(System.in);

      System.out.println("Enter size");
      int size = sc.nextInt();

      int arr[] = new int[size];

      System.out.println("Enter values");
      for(int i=0;i<size;i++){
         arr[i] = sc.nextInt();
      }

      for(int i=0;i<size;i++){
           int rem,sum=0,tmp = arr[i];
          
           while(tmp != 0){
                
              rem = tmp % 10;
              int fact = 1;
     
              while(rem != 0){
                 fact = fact * rem;
                 rem--;
              }

             sum = sum+fact;
             tmp = tmp/10;
           }

         if(sum == arr[i]){
            System.out.print(arr[i]+" ");
          }
           
      }
   }
}
