
import java.util.Scanner;
class Prog6{
  public static void main(String[] args){
    
      Scanner sc = new Scanner(System.in);

      int size = sc.nextInt();

      int arr[] = new int[size];

    
      for(int i=0;i<size;i++){
          arr[i] = sc.nextInt();         
          
         }

      for(int i=0;i<arr.length;i++){
         int tmp = arr[i],rem;
         int sum = 0;

         while(tmp!=0){
           rem = tmp % 10;
           int fact = 1;

            while(rem!=0){
               fact = fact * rem;
               rem--;
            }
           sum = sum+fact;            
           tmp = tmp/10;
         }

         if(sum == arr[i]){
             System.out.println("Strong number : "+arr[i]);
          }
      }
  }
}
