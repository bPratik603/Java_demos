import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prog3 {
   public static void main(String args[]) throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.println("Enter Socity name");
    String name = br.readLine();

    System.out.println("Enter wing name");
    char wing = (char)br.read();

    br.skip(2);

    System.out.println("Enter flat number");
    int flatno = Integer.parseInt(br.readLine());

    System.out.println("name = "+name+"\n wing = "+wing+ "\n flag no = "+flatno);
   } 
}
