import java.io.*;

public class strong_num {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter range");
        int start = Integer.parseInt(br.readLine());
        int end  = Integer.parseInt(br.readLine());

      
        for(int i=start;i<=end;i++){
             int tmp=i,sum=0;
            
                 while(tmp!=0){

                  int rem = tmp%10;
                  int fact = 1;
                  for(int j=1;j<=rem;j++){
                    fact=fact*j;
                  }
                  sum=sum+fact;
                  tmp = tmp/10;
                 }
            

            if(sum==i){
                System.out.println("strong num = "+i);
            }
        }
    }
}
