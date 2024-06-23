public class Prog6 {
    public static void main(String args[]){
        String str1 = "Shashi";
        String str2 = new String("Shashi");

        // here checks the identityHashCode
        if(str1 == str2){
            System.out.println("Equals");
        }else{
            System.out.println("not Equals");
        }

        // here checks the content/value 
        if(str1.equals(str2)){
            System.out.println("Equals");
        }else{
            System.out.println("not Equals");
        }
    }
}
