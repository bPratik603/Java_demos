//not working

import java.io.*;

class Prog12{
   public static void main(String[] args) throws IOException{
     
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       System.out.println("Enter size");
       int size = Integer.parseInt(br.readLine());

       int arr[] = new int[size];

   
     System.out.println("Enter values");
       for(int j=0;j<size;j++){
         arr[j] = Integer.parseInt(br.readLine());
       }

      
       for(int data : arr){
           if(isArmstrong(data)){
                  System.out.println(data+" is Armstrong number");
            }
       }

        
   static boolean isArmstrong(int num){
          
          int rem,tmp = num,sum=0;
          while(tmp !=0){
             rem = tmp%10;
             sum = (rem*rem*rem) +sum;
             tmp = tmp/10;
          }

         return sum == num;
      }
   } 
}


