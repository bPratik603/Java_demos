import java.io.*;

public class ragne_Armstrong {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter range");
        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());

        for(int i=start;i<=end;i++){

            int tmp=i,rem,cnt=0,sum=0;
            while(tmp!=0){
                cnt++;
                tmp=tmp/10;
            }

            tmp=i;

            while(tmp!=0){
                rem=tmp%10;
                int prod=1;
                for(int j=1;j<=cnt;j++){
                    prod = prod*rem;
                }
             
                sum=sum+prod;
                tmp=tmp/10;
            }

            if(sum==i){
                System.out.println(i);
            }
        }
    }
}
