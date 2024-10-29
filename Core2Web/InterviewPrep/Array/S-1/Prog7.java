import java.io.*;

class Prog7{
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
          int count=0;
          for(int j=i;j<size;j++){
              
              if(arr[i] == arr[j])
                count++;

          }

           if(count >= 2){
              System.out.println(arr[i]);
           }
       }
  }
}
