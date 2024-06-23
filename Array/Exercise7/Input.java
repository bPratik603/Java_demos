package Exercise7;

import java.io.*;
public class Input {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter row");
        int row = Integer.parseInt(br.readLine());

        System.out.println("Enter column");
        int col = Integer.parseInt(br.readLine());

        int arr[][] = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }

        for(int[] x : arr){
            for(int y : x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
