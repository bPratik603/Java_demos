import java.util.concurrent.*;
import java.io.*;

class Prog1{
   public static void main(String[] args) throws InterruptedException{
       
      BlockingQueue bQueue = new ArrayBlockingQueue(4);

      bQueue.offer(10);
      bQueue.offer(20);
      bQueue.offer(30);
      bQueue.offer(40);

      System.out.println(bQueue);

      bQueue.put(50);

      System.out.println(bQueue);
   }
}
