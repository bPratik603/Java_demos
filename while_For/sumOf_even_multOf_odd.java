package while_For;

public class sumOf_even_multOf_odd {
    public static void main(String args[]){
        int num=10,sum=0,mult=1;
        int i=1;
        while(i<=num){
        

            if(i%2==0){
                sum=sum+i;
            }else if(i%2==1){
                mult = mult*i;
            }

            i++;
        }

        System.out.println("while: 1 to 10 even number sum = "+sum);
        System.out.println("while: 1 to 10 odd number mult = "+mult);

        sum=0;
        mult=1;
        for(i=1;i<=num;i++){
            if(i%2==0){
                sum=sum+i;
            }else if(i%2==1){
                mult=mult*i;
            }
        }

        System.out.println("For: 1 to 10 even number sum = "+sum);
        System.out.println("For: 1 to 10 odd number sum = "+mult);

    }
}
