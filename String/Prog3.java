public class Prog3 {
    public static void main(String args[]){

        String str1 = "Kanha";
        String str2 = str1;
        String str3 = new String("Kanha");

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
    }
}