package while_For;

public class sum_of_digit {

public static void main(String args[]){
    int n = 6531;
    int sum=0,rem,i;
    i=n;

    while(n!=0){
        rem = n%10;
        sum = sum+rem;
        n = n/10;
    }

    System.out.println("while: sum of digits = "+sum);

    
    for( i=n;i!=0;i=i/10){
        rem = i%10;
        sum = sum+rem;
    }

    System.out.println("For: sum of digits = "+sum);
}
}
