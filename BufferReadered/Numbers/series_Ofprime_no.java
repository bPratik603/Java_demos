

import java.io.*;
public class series_Ofprime_no {
    public static void main(String args[])throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter range");
        int starts = Integer.parseInt(br.readLine());
        int ends = Integer.parseInt(br.readLine());

        for(int i=starts;i<=ends;i++){

            int count=0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    count+=2;
                }

                if(count>2){
                    break;
                }
            }

            if(count<=2 && count!=1){
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }
}
