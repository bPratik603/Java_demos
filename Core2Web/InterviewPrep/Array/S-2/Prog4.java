import java.io.*;

class Prog4{
   public static void main(String[] args) throws IOException{
       
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     System.out.println("Enter size");
     int size = Integer.parseInt(br.readLine());

     int arr[] = new int[size];

     for(int i=0;i<size;i++){
         arr[i] = Integer.parseInt(br.readLine());
     }

     for(int i=0;i<size;i++){
           if(i%2 == 0){
              arr[i] = arr[i]*arr[i]*arr[i];
           }else{
              arr[i] = arr[i]*arr[i];
           }
 
          System.out.print(arr[i]+"  ");
     }
      
      
   }
}
