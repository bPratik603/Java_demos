package if_else;

public class fizz_buzz {
    public static void main(String args[]){
        int n = 17;

         if(n % 3 == 0 && n%5 == 0){
            System.out.println("fizz-buzz");
        }else if(n % 3== 0){
            System.out.println("fizz");
        }else if(n % 5 == 0){
            System.out.println("buzz");
        }else{
            System.out.println("not divisible by both");
        }
    }
}
