import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prog2 {
    public static void main(String args[]) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Ente name");
        String name = br.readLine();

        System.out.println("Enter jursy number");
        int jno = Integer.parseInt(br.readLine());

        System.out.println("Enter avg");
        float avg = Float.parseFloat(br.readLine());

        System.out.println("name = "+name);
        System.out.println("jursy number = "+jno);
        System.out.println("avg = "+avg);
    }
}
