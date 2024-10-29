import java.io.*;

class Prog11{
  public static void main(String[] args) throws IOException{
    
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     System.out.println("Enter size");
     int size = Integer.parseInt(br.readLine());
 
     int arr[] = new int[size];
    
     int i,k,repeat_count = 0;

     System.out.println("Enter values");
     for(i=0;i<size;i++){
       arr[i] = Integer.parseInt(br.readLine());
     }

     for(i=0;i<size;i++){
      
        for(k=0;k<i;k++){
          
             if(arr[i] == arr[k]){
                 break;
             }
        } 

       if(k<i)
          continue;

       repeat_count = 0;
       for(k=i;k<size;++k){
         if(arr[k] == arr[i]){
            repeat_count++;
            break;
          } 
       }
     }

      int new_arr[] = new int[repeat_count];

     for(i=0;i<repeat_count;i++){

        for(k=0;k<i;k++){

             if(arr[i] == arr[k]){
                 break;
             }
        }

       if(k<i)
          continue;

      
         new_arr[i] = arr[i];
     }

    for(int j=0;j<repeat_count;j++){
        System.out.println(new_arr[j]);
     }
  
  } 
} 
