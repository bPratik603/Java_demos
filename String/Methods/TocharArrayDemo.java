package Methods;

// implementing length method
public class TocharArrayDemo {

    static int calLength(String str){

        char arr[] = str.toCharArray();
        int count=0;
        for(int i=0;i<arr.length;i++){
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        
        String str = "Pratik";

        System.out.println(str.length());

        int len = calLength(str);
        System.out.println(len);

        
    }
}
