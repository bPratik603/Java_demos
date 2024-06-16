import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Tocknization {
    public static void main(String args[]) throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter name,middle name,surname");
        String name = br.readLine();

        StringTokenizer st = new StringTokenizer(name," ");

        String name1 = st.nextToken();
        String middle = st.nextToken();
        String surname = st.nextToken();

        System.out.println(name1);
        System.out.println(middle);
        System.out.println(surname);
    }
}
