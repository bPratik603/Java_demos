package Methods;

public class compareLen {

    static int calLen(String str){

        char arr[] = str.toCharArray();
        int count = 0;
        for(int i=0;i<arr.length;i++){
            count++;
        }

        return count;
    }
    public static void main(String args[]){

        String str1 = "Shashi";
        String str2 = "Bagal";

        if(calLen(str1) == calLen(str2)){
            System.out.println("length equals");
        }else{
            System.out.println("length not equals");
        }
    }
}
