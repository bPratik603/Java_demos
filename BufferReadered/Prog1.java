
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Prog1{
    public static void main(String args[]) throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter name");
        String name = br.readLine();

        System.out.println("Enter age");
        int age = Integer.parseInt(br.readLine());

        System.out.println("name = "+name);
        System.out.println("age = "+age);
    }
}