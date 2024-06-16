import java.io.*;

public class perfect_cube {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter range");
        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());

        for(int i=start;i<=end;i++){
            for(int j=1;j<=i;j++){

                if(j*j*j == i){
                    System.out.println(i+"\t");
                }
            }
        }
    }
}
