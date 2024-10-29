import java.io.*;
import java.util.*;

class Prog1{
   public static void main(String[] args) throws IOException{
  
    Properties obj = new Properties();

    FileInputStream fobj = new FileInputStream("Friends.properties");

    obj.load(fobj);

    String name = obj.getProperty("Ashish");
    System.out.println(name);

    obj.setProperty("Shashi","Biencaps");
    
    FileOutputStream outobj = new FileOutputStream("Friends.properties");

    obj.store(outobj,"Updated by Shashi");
   }
}
