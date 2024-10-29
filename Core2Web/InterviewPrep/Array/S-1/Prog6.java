import java.util.*;

class Prog6{
   public static void main(String[] args){
 
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter size");
      int size = sc.nextInt();

      int arr[] = new int[size];

      System.out.println("Enter values");
      for(int i=0;i<size;i++){

         arr[i] = sc.nextInt();
      }

      System.out.println("Enter number to be search");
      int search = sc.nextInt();

      boolean flag = false;
        int i;
      for(i=0;i<size;i++){
        
         if(arr[i] == search){
              break;
         }
      }

       if(i != size){
          System.out.println(search+" found at index "+i);
        }else{
          System.out.println("value not present in array");
        }
   }
}
