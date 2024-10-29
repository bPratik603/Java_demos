import java.io.*;

class Prog7{
  public static void main(String[] args) throws IOException{

   BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

   int size = Integer.parseInt(br.readLine());

   char arr[] = new char[size];
   int arr1[] = new int[size];

   for(int i=0;i<size;i++){
     arr[i] = (char)(br.read());
     br.skip(1);
    
  //  arr1[i] = (int)arr[i];

   }


   for(int i=0;i<size;i++){
     if((arr[i] >=65 && arr[i]<=90) || ((arr[i]>=97 && arr[i]<=122)))
        System.out.print((char)arr[i]+" ");
   }

 }
}
