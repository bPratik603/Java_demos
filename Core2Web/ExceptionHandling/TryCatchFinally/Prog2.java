import java.io.*;

class Prog2{

  public static void main(String args[])throws IOException{
     System.out.println("Main starts");
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     String name = br.readLine();
     System.out.println(name);

     int age = 0;
     try{
       age = Integer.parseInt(br.readLine());
     }catch(NumberFormatException obj){
        System.out.println("please enter integer value");
        age = Integer.parseInt(br.readLine());
     }catch(Exception obj1){
        System.out.println("Please enter integer value");
        age = Integer.parseInt(br.readLine());
     }

     System.out.println("Main ends");
  }
}


