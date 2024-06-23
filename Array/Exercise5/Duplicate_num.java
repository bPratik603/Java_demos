package Exercise5;

import java.io.*;
public class Duplicate_num {

    static int check(int arr[],int size){

        int count;
        for (int i = 0; i < arr.length; i++) {
            count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                   count++;
                }
            }

            if(count > 1){
                return i;
            }
        }

        return 0;
    }
    
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int answer =  check(arr,size);

        System.out.println(answer);
        if(answer != 0){
            System.out.println("Frist duplicate present at index "+answer);
        }
    }
}
