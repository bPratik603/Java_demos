
class Prog1{
public static void main(String[] args) {
    String str1 = "Core2Web";
    String str2 = new String("Core2Web");

    String str3 = "Core2Web";
    String str4 = new String("Core2Web");

    System.out.println(System.identityHashCode(str1));
    System.out.println(System.identityHashCode(str2));
    System.out.println(System.identityHashCode(str3));
    System.out.println(System.identityHashCode(str4));

    char arr[] = {'A','B','C'};

    System.out.println(arr);
    System.out.println("Array = "+arr);

    char arr1 = 'A';
    int x = 65;

    System.out.println(arr1);
    System.out.println(x);

    System.out.println(System.identityHashCode(arr1));
    System.out.println(System.identityHashCode(x));

    
}
}