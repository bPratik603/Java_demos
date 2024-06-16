package while_For;

public class Armstrong {
    public static void main(String args[]){
        int num=153,rem,count=0,sum=0;
        int tmp = num;
        int tmp1 = num;
        
        while(num != 0){
            count++;
           num = num/10; 
        }

        while(tmp!=0){
            rem = tmp%10;
            int mult = 1;

            for(int i=1;i<=count;i++){
                mult = mult*rem;
            }

            sum = sum+mult;
            tmp = tmp/10;
        }

        if(sum == tmp1){
            System.out.println("Armstrong");
        }else{
            System.out.println("not a Armstrong");
        }
    }
}
