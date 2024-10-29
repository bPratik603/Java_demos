import java.io.*;

class Prog3{
   public static void main(String[] args) throws IOException{
      
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     int size = Integer.parseInt(br.readLine());

     int arr[] = new int[size];
  
     int sum = 0;

     for(int i=0;i<arr.length;i++){
        arr[i] = Integer.parseInt(br.readLine());
        sum+=arr[i];
     }

     System.out.println("sum = "+sum);


   }
}
