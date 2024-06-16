package if_else;

public class profit_loss {
    public static void main(String args[]){
        int sp = 900;
        int cp = 900;

        if(sp-cp >0){
            System.out.println("profit of "+(sp-cp));
        }else if(sp-cp <0){
            System.out.println("loss of "+(sp-cp));
        }else{
            System.out.println("no profit or loss");
        }
    }
}
