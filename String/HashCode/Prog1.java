package HashCode;

public class Prog1 {
    public static void main(String args[]){

        String str1 = "Shashi";
        String str2 = new String("Shashi");
        String str3 = "Shashi";
        String str4 = new String("Shashi");

        // it checks value
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());

        String str5 = "Pratik";
        String str6 = new String("Pratik");
        String str7 = "Pratik";
        String str8 = new String("Pratik");

        System.out.println(str5.hashCode());
        System.out.println(str6.hashCode());
        System.out.println(str7.hashCode());
        System.out.println(str8.hashCode());
    }
}
