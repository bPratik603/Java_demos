import java.util.*;

class Prog2{
  public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter size");
     int size = sc.nextInt();

     int arr[] = new int[size];

     System.out.println("Enter values");
     for(int i=0;i<size;i++){
        arr[i] = sc.nextInt();
     }

     for(int i=0;i<size;i++){
           
          for(int j=1;j<size-1;j++){
              if(arr[j-1] > arr[j]){
               int tmp = arr[j-1];
               arr[j-1] = arr[j];
               arr[j] = tmp;
               }
          }
     }

     for(int i=0;i<size;i++){
     System.out.println(arr[i]);
     }
  }
}
