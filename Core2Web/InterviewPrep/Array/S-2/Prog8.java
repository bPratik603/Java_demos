import java.util.*;

class Prog8{
   public static void main(String[] args){
       
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter size");
      int size = sc.nextInt();

      int arr[] = new int[size];

      System.out.println("Enter values");
     for(int i=0;i<size;i++){
         arr[i] = sc.nextInt();
     }

     for(int i=0;i<size;i++){
        
          int rem,tmp = arr[i],sum=0;
          
          while(tmp != 0){
           rem = tmp % 10;
           sum = (rem*rem*rem) + sum;
           tmp = tmp/10;
          }

          if(sum == arr[i]){

             System.out.println(arr[i]+" ");
          }
     }
   }
}
