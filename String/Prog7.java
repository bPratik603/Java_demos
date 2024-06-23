public class Prog7 {
    public static void main(String args[]){

        String str1 = "Shashi";
        String str2 = "Bagal";

        String str3 = str1+str2;

        System.out.println(str3);
        System.out.println(str1.concat(str2));

        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str1.concat(str2)));
    }
}
