import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Tokenization {
    public static void main(String args[]) throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter IPL Team name, Group, Position, runrate");
        String IPL = br.readLine();

         StringTokenizer st = new StringTokenizer(IPL,",");

         String name = st.nextToken();
         String group = st.nextToken();
         String position = st.nextToken();
         String runrate = st.nextToken();

        System.out.println("name = "+name);
        System.out.println("group = "+ group.charAt(0));
        System.out.println("position = "+ Integer.parseInt(position));
        System.out.println("runrate = "+ Float.parseFloat(runrate));
    }
}
