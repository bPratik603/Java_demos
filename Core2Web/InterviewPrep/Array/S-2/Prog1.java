import java.io.*;

class Prog1{
   public static void main(String[] args) throws IOException{
        
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     System.out.println("Enter size");
     int size = Integer.parseInt(br.readLine());

     char arr[] = new char[size];
     
     System.out.println("Enter values");
     for(int i=0;i<size;i++){

         arr[i] = (char)(br.read());
          br.skip(1);
     }
        for(int i=0;i<size;i++){
         if((arr[i] >= 65 && arr[i] <= 90) ||  (arr[i] <= 122 && arr[i] >= 97)){
            System.out.println(arr[i]);
         }
       }
      }
   }

