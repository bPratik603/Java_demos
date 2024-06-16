import java.io.*;

// jya number chya divisers chi some toch number ato tya la perfect number mhantat
// 6 : 1+2+3 = 6

public class perfect_numbers {
    public static void main(String  args[])throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter range");
        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());

        
        for(int i=start;i<=end;i++){
            int sum=0;
            for(int j=1;j<i;j++){

                if(i%j==0){
                    sum = sum+j;
                }
            }

            if(sum == i){
                System.out.println("perfect number = "+ i);
            }
        }
    }
}
