import java.util.concurrent.*;


class Producer implements Runnable {
 
    BlockingQueue bQueue = null;

    Producer(BlockingQueue bQueue){
      this.bQueue = bQueue;
    }

    public void run(){
      for(int i=1;i<=10;i++){
         try{
           bQueue.put(i);
           System.out.println("Producer "+i);
        }catch(InterruptedException ie){

       }
      }

      try{
          System.out.println("Inside Producer sleep");
          Thread.sleep(1000);
      }catch(InterruptedException ie){

      }
    }
}


class Consumer implements Runnable{
    BlockingQueue bQueue = null;

     Consumer(BlockingQueue bQueue){
        this.bQueue = bQueue;
     }

     public void run(){
        
         for(int i=1;i<=10;i++){
           try{
                bQueue.take();
                System.out.println("Consumer "+i);
           }catch(InterruptedException ie){

           }
         }

        try{
           Thread.sleep(3000);
        }catch(InterruptedException ie){

        }       
     }
 }


class ProducerConsumer{
   public static void main(String[] args){
    
      BlockingQueue pQueue = new ArrayBlockingQueue(10);

      Producer p = new Producer(pQueue);
      Consumer c = new Consumer(pQueue);

      Thread t1 = new Thread(p);
      Thread t2 = new Thread(c);

      t1.start();
      t2.start();
   }
}













