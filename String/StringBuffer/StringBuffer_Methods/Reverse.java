package StringBuffer.StringBuffer_Methods;

public class Reverse {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Shashi");
        System.out.println(sb.reverse());

        StringBuffer sb1 = new StringBuffer("Core2Web");
        String str1 = sb1.reverse().toString();
        System.out.println(str1);
    }
}
