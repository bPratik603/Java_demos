import java.io.*;

class Prog1{

   public static void main(String[] args) throws IOException{
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        System.out.println("Enter values");
        for(int i=0;i<size;i++){
            
            arr[i] = Integer.parseInt(br.readLine());
      
         }

        for(int i=0;i<size;i++){
           if(arr[i] %2 == 0){
              System.out.println("Even : "+arr[i]);
           }else{
              System.out.println("odd : "+arr[i]);
           }
       }  
   }
}
