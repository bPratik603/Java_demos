import java.io.*;

class Prog1{
   public static void main(String[] args) throws FileNotFoundException,IOException{

      FileInputStream fits = new FileInputStream("Incubator.txt");

      FileDescriptor fd = fits.getFD();

      FileReader fr = new FileReader(fd);

      int data = fr.read();

      while(data != -1){
         System.out.print((char)data);
         data = fr.read();
      }
      fr.close();
   }
}
