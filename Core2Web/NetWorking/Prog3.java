import java.net.*;
import java.io.*;
import java.util.*;

class Prog3{
   public static void main(String[] args) throws MalformedURLException,IOException{
    
      URL obj = new URL("https://www.core2web.in");

      URLConnection conn = obj.openConnection();

      System.out.println("Last Modified "+new Date(conn.getLastModified()));

      System.out.println("contact "+conn.getContentType());
   }
}
