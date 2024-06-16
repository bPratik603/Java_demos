

public class Integer_Cache1 {
    public static void main(String args[]){
        
        int num1 = 127;
        int num2 = 127;
        int num3 = 127;

        char char1 = 'Z';
        char char2 = 'Z';
        char char3 = 'Z';

        int num4 = -127;
        int num5 = -127;
        Integer num6 = -127;

       
        System.out.println(System.identityHashCode(num1));
        System.out.println(System.identityHashCode(num2));
        System.out.println(System.identityHashCode(num3));

        System.out.println(System.identityHashCode(char1));
        System.out.println(System.identityHashCode(char2));
        System.out.println(System.identityHashCode(char3));

        System.out.println(System.identityHashCode(num4));
        System.out.println(System.identityHashCode(num5));
        System.out.println(System.identityHashCode(num6));
    }
}
