package Exercise;
import java.util.Scanner;
public class Concat {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(str1.concat(str2));

        String cal = str1+str2;        
        System.out.println(cal.length());
    }
}
