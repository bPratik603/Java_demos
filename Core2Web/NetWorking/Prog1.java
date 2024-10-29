import java.net.*;
import java.io.*;


class Prog1{
   public static void main(String[] args)throws IOException,UnknownHostException{
       
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      String site = br.readLine();

      InetAddress ip = InetAddress.getByName(site);

      System.out.println("IP address = "+ip);
   }
}
