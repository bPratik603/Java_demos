import java.io.*;

class Prog9{
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter size");
    int size = Integer.parseInt(br.readLine());

    int arr1[] = new int[size];
    int arr2[] = new int[size];

    System.out.println("Enter values for array 1");
     for(int i=0;i<size;i++){

        arr1[i] = Integer.parseInt(br.readLine());
     } 


     System.out.println("Enter values for array 2");
      for(int i=0;i<size;i++){
        arr2[i] = Integer.parseInt(br.readLine());
      }

     int arr3[] = new int[size];

     for(int i=0;i<size;i++){
        System.out.print( (arr3[i] = arr1[i] + arr2[i])+" ");
     }
  }
}
