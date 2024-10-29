import java.io.*;

class Prog5{
   
     public static void main(String[] args) throws IOException{

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         System.out.println("Enter size");
         int size = Integer.parseInt(br.readLine());

         int arr[] = new int[size];

         System.out.println("Enter values");
         for(int i=0;i<size;i++){
             arr[i] = Integer.parseInt(br.readLine());
         }

        int max=arr[0];
        int min = arr[0];

        for(int i=0;i<size;i++){
           if(arr[i] > max){
               max = arr[i];
           }

           if(arr[i] < min){
              min = arr[i];
           }
        }

       System.out.println("max : "+max);
       System.out.println("min : "+min);
     }
}
