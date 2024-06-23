package StringBuffer;

public class Prog2 {
    public static void main(String[] args){

        StringBuffer sb = new StringBuffer();

        System.out.println(sb);
        System.out.println(sb.capacity());

        sb.append("Shashi"); 
        // 6 byts
        System.out.println(sb);
        System.out.println(sb.capacity());

        sb.append("Bagal");
        //  6 + 6 = 12;
        System.out.println(sb);
        System.out.println(sb.capacity());

        sb.append("Core2Web");
        // 12 + 8 = 20 byts;
        // but, (16 + 1)*2 = 34 byts
        System.out.println(sb);
        System.out.println(sb.capacity());
    }
}
