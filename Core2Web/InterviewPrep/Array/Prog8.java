import java.util.*;

class Prog8{
   public static void main(String[] args){
     
      Scanner sc = new Scanner(System.in);
   

      int size = sc.nextInt();

      int arr[] = new int[size];

      int oddSum = 0,evenSum=0;
      for(int i=0;i<size;i++){
          
         arr[i] = sc.nextInt();
         
         if(arr[i] %2 == 0){
            evenSum+=arr[i];
         }else{
             oddSum+=arr[i];
         }
      }

       System.out.println("even sum = "+evenSum);
       System.out.println("odd sum = "+oddSum);
}
}
