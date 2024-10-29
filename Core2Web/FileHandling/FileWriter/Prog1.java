import java.io.*;

class Prog1{
  public static void main(String[] args) throws IOException{

    FileWriter fw = new FileWriter("Incubator.txt");

     fw.write("Flutter\n");
     fw.write("Backend\n");
     fw.write("FrontEnd\n");

     fw.close();

  }
}
