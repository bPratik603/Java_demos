import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prog4 {
    public static void main(String args[]) throws IOException{
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br1 = new BufferedReader(isr);
        BufferedReader br2 = new BufferedReader(isr);

        System.out.println("Enter name");
        String name = br1.readLine();

        // stream closed,connection cut with keybord
        br1.close();

        System.out.println("Enter surname");
        String surname = br2.readLine();

        System.out.println("name = "+name);
        System.out.println("surname = "+surname);

    }
} 
