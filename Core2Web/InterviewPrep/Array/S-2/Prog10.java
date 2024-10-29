import java.io.*;

class Prog10{
  public static void main(String[] args) throws IOException{

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     System.out.println("Enter size");
     int size = Integer.parseInt(br.readLine());

     char arr1[] = new char[size];
     char arr2[] = new char[size];

     System.out.println("Enter charactors values for array 1");
     for(int i=0;i<size;i++){

         arr1[i] = (char)br.read();
          
         br.skip(1);
      }


     System.out.println("Enter charactors values for array 2");
     for(int i=0;i<size;i++){
       
        arr2[i] = (char)br.read();
        
        br.skip(1);

     }

     for(int i=0;i<size;i++){

        if(arr1[i] > arr2[i]){

           System.out.println(arr1[i]+" - "+arr2[i]+" = "+(arr1[i] - arr2[i]));
        }else{
          System.out.println(arr2[i]+" - "+arr1[i]+" = "+(arr2[i] - arr1[i]));
         }
     }


  }
}
