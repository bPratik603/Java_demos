import  java.io.*;

public class range_reverse_num {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter range");
        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());

        for(int i=start;i<=end;i++){
            int tmp = i;
            int rev=0,rem;
            while(tmp!=0){
                rem = tmp%10;
                rev = (rev*10)+rem;
                tmp = tmp/10;
            }

            System.out.println("Reverse of "+i+" is "+rev);
        }
    }
}
