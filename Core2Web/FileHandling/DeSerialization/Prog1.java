import java.io.*;

class Prog1{
   public static void main(String[] args) throws ClassNotFoundException,IOException{
          
      FileInputStream fis = new FileInputStream("PlayerData.txt");

      ObjectInputStream ois = new ObjectInputStream(fis);

      Player obj1 = (Player)ois.readObject();
      Player obj2 = (Player)ois.readObject();

      fis.close();
      ois.close();

      System.out.println("jerNO: "+obj1.jerNo);
      System.out.println("pName: "+obj2.pName);

      System.out.println("jerNo: "+obj1.jerNo);
      System.out.println("pName: "+obj2.pName);
   }
}
