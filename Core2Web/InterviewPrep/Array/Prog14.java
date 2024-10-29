import java.io.*;

class Prog14{
   public static void main(String[] args) throws IOException{

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
       System.out.println("Enter Number");
       String strNum = br.readLine();

       int arr[] = new int[strNum.length()];

       for(int i=0;i<arr.length;i++){
           
           arr[i] = strNum.charAt(i);
       }

       int tmp=arr[0];

       for(int i=1;i<arr.length;i++){
              
              
            if(arr[i] == 0 && tmp == 0){
                  System.out.println("hello");
                System.out.println("Trailing zeros at index: "+i+" index: "+(i-1));
                  
             }
                 tmp = arr[i];
                
             
       }
 }
}
