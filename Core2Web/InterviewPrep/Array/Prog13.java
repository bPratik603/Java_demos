import java.util.*;

class Prog13{
   public static void main(String[] args){
         
       Scanner sc = new Scanner(System.in);

       int arr[] = {2,4,1,6,8,5};

       System.out.println("Enter Number");
       int num = sc.nextInt();

       for(int i=0;i<num;i++){
         
         for(int j=0;j<num;j++){
          if(num == (arr[i] + arr[j])){
                 System.out.println("index: "+i+" index: "+j);
           }
         }
       }
   }
}
