import java.io.*;

class Prog1{
   public static void main(String[] args) throws IOException{
   
      File obj1 = new File("FileHandling");
      obj1.mkdir();

      File obj2 = new File(obj1,"Code1.txt");
      obj2.createNewFile();

      System.out.println(obj2.getName());

      System.out.println(obj2.getParent());

      System.out.println(obj2.getParentFile());

      System.out.println(obj2.getPath());
 
      System.out.println(obj2.getAbsolutePath());

      System.out.println(obj2.canRead());

      System.out.println(obj2.canWrite());
      
      System.out.println(obj2.exists());

      System.out.println(obj2.isDirectory());

      System.out.println(obj2.isFile());

      System.out.println(obj2.isHidden());

      System.out.println(obj2.lastModified());



   }
}
