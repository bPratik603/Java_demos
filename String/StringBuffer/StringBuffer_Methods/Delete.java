package StringBuffer.StringBuffer_Methods;

public class Delete {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("ShashiBagalCore2Web");

        sb.delete(6, 11);
        System.out.println(sb);
    }
}
