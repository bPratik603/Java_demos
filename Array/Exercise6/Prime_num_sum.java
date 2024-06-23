package Exercise6;

import java.io.*;
public class Prime_num_sum {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int count1=0,count2=0,sum=0;
        for(int i=0;i<arr.length;i++){
            count1=0;
            for(int j=1;j<=arr[i];j++){
                if(arr[i]%j==0){
                    count1++;
                }
            }

            if(count1 == 2){
                sum = sum+arr[i];
                count2++;
            }
        }

        System.out.println("sum of prime number is "+sum+" count "+count2);
    }
}
