import java.io.*;

class Prog4{
  public static void main(String[] args) throws IOException{
     
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
     int size = Integer.parseInt(br.readLine());

     int arr[] = new int[size];
  

     for(int i=0;i<arr.length;i++){
       arr[i] = Integer.parseInt(br.readLine());
     }

   
    
     for(int i=0;i<arr.length;i++){
       int flag = 0;
        int count=0;
       
        for(int j=0;j<arr.length;j++){
           if(arr[i] == arr[j]){
              flag = 1;
              break;
            }
        }



        if(flag == 1)
            continue;

        for(int j=0;j<=i;j++){
           if(arr[i] == arr[j]){
              count++;
           }
        }
      
         System.out.println("frequency of "+arr[i]+" is "+count );
     }
   }
}
