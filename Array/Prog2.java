import java.io.*;

public class Prog2 {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size,evenCount=0,oddCount=0;

        System.out.println("Enter size");
        size = Integer.parseInt(br.readLine());

        int arr1[] = new int[size];
        for(int i=0;i<arr1.length;i++){
            arr1[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0;i<arr1.length;i++){
            if(arr1[i] %2 ==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }

        System.out.println("even count = "+evenCount);
        System.out.println("odd count = "+oddCount);
    }
}
