package while_For;

public class factorial {
    public static void main(String args[]){
        int num=5,fact=1,tmp=num;

        while(num>0){
            fact = fact*num;
            num--;
        }

        System.out.println("while: factorial of "+tmp+" is "+fact);

        for(int i=1;i<=num;i++){
             fact = fact*i;
        }

        System.out.println("For: factorial of "+tmp+" is "+fact);
    }
}
