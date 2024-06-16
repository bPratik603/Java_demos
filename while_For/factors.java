package while_For;

public class factors {
    public static void main(String args[]){
        int num=24,count=0,i=1;

        System.out.println("While: ");
        while(i<=num){
            if(num % i ==0){
                count++;
                System.out.println(i);
            }
            i++;
        }

        count = 0;
        System.out.println("For: ");
        for(int k=1;k<=num;k++){
            if(num%k == 0){
                count++;
                System.out.println(k);
            }
        }
    }
}
