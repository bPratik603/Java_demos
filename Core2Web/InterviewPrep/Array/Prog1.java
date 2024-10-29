
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Prog1{
   
    public static void main(String[] args) throws IOException{

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int num;
       num = Integer.parseInt(br.readLine());
       int arr[] = new int[num];

       int max=0;

        for(int i=0;i<arr.length;i++){
           arr[i] = Integer.parseInt(br.readLine());
           if(arr[i] > max){
                 max = arr[i];
            }
	}

        System.out.println(max);
    }
}
