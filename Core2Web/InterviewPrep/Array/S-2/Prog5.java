import java.util.*;

class Prog5{
  public static void main(String[] args){
     
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter size");
     int size = sc.nextInt();

     int arr1[] = new int[size];
     int arr2[] = new int[size];

     System.out.println("Enter values for array 1");
     for(int i=0;i<size;i++){
        arr1[i] = sc.nextInt();
     }

     System.out.println("Enter values for array 2");
     for(int i=0;i<size;i++){
       arr2[i] = sc.nextInt();
     }

     int arr3[] = new int[size+size];
     
     for(int i=0;i<size;i++){
          arr3[i] = arr1[i];
     }

     int tmp = size;
     for(int i=0;i<arr1.length;i++){
           arr3[tmp] = arr2[i];
           tmp++;
           
     }

      for(int i=0;i<size+size;i++){
          System.out.println(arr3[i]);
     }
  }
}
