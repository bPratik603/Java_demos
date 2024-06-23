package Exercise7;

import java.io.*;
public class sum_each_col {
    public static void main(String args[])throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter row and col");
        int row = Integer.parseInt(br.readLine());
        int col = Integer.parseInt(br.readLine());

        int arr[][] = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]  = Integer.parseInt(br.readLine());
            }
        }

        int c1=0,c2=0,c3=0;
        int i,j;
        for (i = 0; i < row; i++) {
        
            for(j=0;j<col;j++){
                   
               if(j==0){
                c1 = c1+arr[i][j];
               }else if(j==1){
                c2 = c2+arr[i][j];
               }else if(j==2){
                c3 = c3+arr[i][j];
               }
            }

            System.out.println("sum of row 1 "+ c1);
            System.out.println("sum of row 2 "+ c2);
            System.out.println("sum of row 3 "+ c3);
            
        }
    }
}
