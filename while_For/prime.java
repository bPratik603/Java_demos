package while_For;

public class prime {
    public static void main(String args[]){
        int num=9,i=1,count=0;

        while(i<=num){
            if(num%i == 0){
                count++;
            }
            i++;
        }

        if(count == 2){
            System.out.println("while: Prime");
        }else{
            System.out.println("while: not prime");
        }

        count=0;
        for(i=1;i<=num;i++){
            if(num%i == 0){
            
                count++;
            }
        }

        
        if(count==2){
            System.out.println("For: Prime");
        }else{
            System.out.println("For: not Prime");
        }
    }
}
