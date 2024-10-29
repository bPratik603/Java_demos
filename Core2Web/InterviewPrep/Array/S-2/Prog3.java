import java.io.*;

class Prog3{
  public static void main(String[] args) throws IOException{
       
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     System.out.println("Enter size");
     int size = Integer.parseInt(br.readLine());

     int arr[] = new int[size];

     int evenCount=0,oddCount=0;

     for(int i=0;i<size;i++){
        arr[i] = Integer.parseInt(br.readLine());
        if(arr[i] %2 == 0){
            evenCount++;
        }else{
            oddCount++;
       }
     }

     System.out.println("Event num count = "+evenCount);
     System.out.println("Odd num count = "+oddCount);
  }
}
