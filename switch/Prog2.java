public class Prog2 {
    public static void main(String args[]){
        int x=5;
        int a=1;
        int b=2;

        switch(x){
            case 1:
                   System.out.println("1");
                   break;
            
            case 2:
                   System.out.println("2");
                   break;

            case 1+2:
                   System.out.println("3");
                   break;

            case 2+2:
                   System.out.println("4");
                   break;

            case 2+2+1:
                  System.out.println("5");
                  break;
        }
    }
}
