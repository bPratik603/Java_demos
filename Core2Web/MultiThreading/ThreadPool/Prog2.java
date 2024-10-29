import java.util.concurrent.*;


class MyThread implements Runnable{
   int num;
  
   MyThread(int num){
     this.num = num;
   }

   public void run(){
     System.out.println(Thread.currentThread()+" start Thread "+num);
     DailyTask();
     System.out.println(Thread.currentThread()+" end Thread "+num);
   }

   void DailyTask(){
      try{
        Thread.sleep(1000);
      }catch(InterruptedException ie){

      }
   }
}

class Prog2{

   ThreadPoolExecutor tpe1 = (ThreadPoolExecutor)Executors.newFixedThreadPool(2);

   ThreadPoolExecutor tpe2 = (ThreadPoolExecutor)Executors.newFixedThreadPool(2);

   for(int i=0;i<=4;i++){
      MyThread obj = new MyThread(i);
      tpe1.execute(obj);
   }

   for(int i=0;i<=4;i++){
      MyThread obj = new MyThread(i);
      tpe2.execute(obj);
   }

   tpe1.shutdown();
   tpe2.shutdown();
 
}
