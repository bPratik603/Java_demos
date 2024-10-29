import java.util.Scanner;

class Prog1{
   public static void main(String[] args){

     System.out.println("Main starts");
      Scanner sc = new Scanner(System.in);

      int x = sc.nextInt();
      try{
       if(x == 0){
         throw new ArithmeticException("Divide by zero");
        }
       System.out.println(10/x);
      }catch(ArithmeticException obj){
            System.out.println("Exception in  "+Thread.currentThread().getName()+" ");
            obj.printStackTrace();
       }
 
      System.out.println("Main ends");
   }
}
