import java.util.Scanner;

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
           int count = 0;
              for(int j=1;j<=arr[i];j++){
         
                   if(arr[i]%j == 0)
                      count++;

              }

          if(count == 2)
             System.out.println(arr[i]+" is Prime Number");
    }
   }
}
