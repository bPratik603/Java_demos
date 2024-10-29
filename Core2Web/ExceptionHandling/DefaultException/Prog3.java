import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Prog3{
  void m1() throws IOException{
    System.out.println("In m1");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int num = Integer.parseInt(br.readLine());
    System.out.println(num);
  }

   public static void main(String[] args)throws IOException{
     System.out.println("Main starts");
     Prog1 obj = new Prog1();
     obj.m1();
     System.out.println("Main ends");
   }
}
