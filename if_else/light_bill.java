package if_else;

public class light_bill {
    public static void main(String args[]){
        int n = 200;

        if(n<=100){
            System.out.println(n*1);
        }else{
            System.out.println(100*1+(n-100)*2);
        }
    }
}
