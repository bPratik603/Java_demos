package StringBuffer.StringBuffer_Methods;

public class append {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer();

        System.out.println(sb);
        System.out.println(sb.capacity());

        sb.append("Bagal");
        System.out.println(sb);
        System.out.println(sb.capacity());

        sb.append("shashiiiiiiiiiiiiiii");
        System.out.println(sb);
        System.out.println(sb.capacity());

        System.out.println("\nsb1");

        StringBuffer sb1 = new StringBuffer("Shashi");
        // 22 byts
        System.out.println(sb1);
        System.out.println(sb1.capacity());

        sb1.append("bagallllllllllllll");
        // append kelyavr 16 byts madhe data add hot jato jevha 16 byts full hotat tevha StringBuffer initialise kartana ji String diltav tyachi bytes * 2 avdi memory (16 + 1)*2 madhe add hote  
         System.out.println(sb1);
        System.out.println(sb1.capacity());



    }
}
