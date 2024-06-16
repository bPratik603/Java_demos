package while_For;

public class mult_of_digit {
    public static void main(String args[]){
        int n=143,mult=1,rem,i;
    

        while(n!=0){
            rem = n%10;
            mult = mult*rem;
            n = n/10;
        }

        System.out.println("while: mult of digits = "+mult);

        for(i=n;i!=0;n=n/10){
            rem = i%10;
            mult = mult*rem;
        }

        System.out.println("For: mult of digits = "+mult);
    }
}
