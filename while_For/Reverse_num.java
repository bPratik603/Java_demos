package while_For;

public class Reverse_num {
    public static void main(String args[]){
    int num=942111423,rem,rev=0,i;

    while(num!=0){
        rem = num%10;
        rev = (rev*10)+rem;
        num = num/10;
    }

    System.out.println("while: rev = "+rev);

    for(i=num;i!=0;i=i/10){
        rem = i%10;
        rev = (rev*10)+rem;
    }

    System.out.println("For: rev = "+rev);
}
}
