package while_For;

public class Perfect_square {
    public static void main(String args[]){
        int n=30,i=1;

        System.out.println("while: ");
        while(i*i <=n){
            System.out.println(i+" "+i*i);
            i++;
        }

        System.out.println("For: ");
        for(int k=1;k*k<=n;k++){
            System.out.println(k+" "+k*k);
        }

    }
}
