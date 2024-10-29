import java.util.*;
import java.util.concurrent.*;

class Prog1{
   public static void main(String[] args) throws InterruptedException{
      
      BlockingQueue bq = new PriorityBlockingQueue();

      bq.put("Rahul");
      bq.put("Abhishek");
      bq.put("Pramod");
      bq.put("Rakesh");

      System.out.println(bq);
   }
}
