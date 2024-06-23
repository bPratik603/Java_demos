package StringBuffer;

public class Prog1 {
    public static void main(String args[]){

        String str1 = "Shashi";
        String str2 = new String(str1);

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

        str1.concat(str2);

        System.out.println(System.identityHashCode(str1));

        StringBuffer sb = new StringBuffer("Core2");

        sb.append("Web");
        System.out.println(System.identityHashCode(sb));
        System.out.println(sb);
        System.out.println(System.identityHashCode(sb));
    }
}
