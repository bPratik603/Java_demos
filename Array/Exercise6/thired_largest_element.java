

// --------- not completed ----------


package Exercise6;

import java.io.*;
public class thired_largest_element {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int tmp = arr[0];
        int secondLarg = arr[0];
        int thiredLarg = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > tmp){
                thiredLarg = arr[i];
                secondLarg = tmp;
                tmp = arr[i];
            }

        }

        System.out.println("third largest element is "+thiredLarg);
    }
}
