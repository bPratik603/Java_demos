import java.util.concurrent.*;
import java.util.*;

class Prog1{
   public static void main(String[] args)throws InterruptedException{
      
       BlockingQueue bQueue = new ArrayBlockingQueue(3);

       bQueue.put(10);
       bQueue.put(20);
       bQueue.put(30);

       System.out.println(bQueue);
       
       bQueue.offer(50,5,TimeUnit.SECONDS);

       System.out.println(bQueue);

//       bQueue.take();
  //     System.out.println(bQueue);       
  
       ArrayList al = new ArrayList();

       System.out.println(al);

       bQueue.drainTo(al);
     
       System.out.println(al);

       System.out.println(bQueue);
 }
}


