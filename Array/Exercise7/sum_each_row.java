package Exercise7;

import java.io.*;
public class sum_each_row {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter col and row");
        int row = Integer.parseInt(br.readLine());
        int col = Integer.parseInt(br.readLine());

        int arr[][] = new int[row][col];

        int sum = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }

        for(int i=0;i<row;i++){
            sum=0;
        
            for(int j=0;j<col;j++){
                sum = sum+arr[i][j];
            }

            System.out.println("Sum of row "+ (i) +" is "+sum);
        }
        }
    }

