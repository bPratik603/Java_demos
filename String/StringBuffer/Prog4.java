package StringBuffer;

public class Prog4 {
    public static void main(String args[]){

        String str1 = "Shashi";
        StringBuffer str2 = new StringBuffer("Bagal");
        StringBuffer str3 = new StringBuffer("Core2Web");

        // String str3 = str1.concat(str2);
        // concat() method of String class can only accept String as parameter.

        str2.append(str1);
        // typeof(str1) : String 

        str3.append(str2);
        // typeof(str2) : StringBuffer

        // append() method of StringBuffer Class can accept both String and StringBuffer as parameter.

        System.out.println(str2);
        System.out.println(str3);
    }
}
