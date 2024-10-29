import java.util.Scanner;

class HighRainException extends RuntimeException{
      HighRainException(String msg){
           super(msg);
      }
}

class SnowflexException extends RuntimeException{
      SnowflexException(String msg){
            super(msg);
	}
}

     
class Prog3{
   public static void main(String args[]){
     System.out.println("Main starts");

     Scanner sc = new Scanner(System.in);

     String wether = sc.nextLine();

     if(wether.equals("Highrain")){
        throw new HighRainException("Match Delay due to High Raining");
     }else if(wether.equals("Snowflex")){
        throw new SnowflexException("Match Delay due to Snowflex");
     }else{
       System.out.println("Match Begins");
     }

     System.out.println("Main ends");     
   }
}
