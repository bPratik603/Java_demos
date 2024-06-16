package while_For;

public class even_digit_square {
    public static void main(String args[]){
    int num = 942111423,rem,tmp=num;


    System.out.println("while: ");
     while(num!=0){
        rem = num%10;

        if(rem%2 == 0){
            System.out.println(rem*rem);
        }
        num=num/10;
     }

     System.out.println("For: ");
     for(tmp=942111423;tmp!=0;tmp=tmp/10){
       rem = tmp%10;

       if(rem%2 == 0){
        System.out.println(rem*rem);
       }
     }
    }
}
