import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Prog2{
   public static void main(String[] args) throws IOException{
       
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
      int num = Integer.parseInt(br.readLine());

      int arr[] = new int[num];

     

      for(int i=0;i<arr.length;i++){
         arr[i] = Integer.parseInt(br.readLine());
         
      }

     int min = arr[0];

     for(int i=0;i<arr.length;i++){
         if(min > arr[i]){
            min = arr[i];
         }
     } 

       System.out.println("min = "+min);
   }
}
