import java.util.concurrent.*;

class ExecutorDemo implements Runnable{
    
     int num;
     ExecutorDemo(int num){
        this.num = num;
     }

     public void run(){
       System.out.println(Thread.currentThread()+" Start Thread "+num);
        DailyTask();
       System.out.println(Thread.currentThread()+" End Thread "+num);
     }

     void DailyTask(){
        
       try{
        Thread.sleep(1000);
      }catch(InterruptedException ie){
         
      }
    }
} 


class Prog1{
    public static void main(String args[]){
      
       ExecutorService ser  =  Executors.newCachedThreadPool();

       for(int i=0;i<=6;i++){
        
         ExecutorDemo obj = new ExecutorDemo(i);
          ser.execute(obj);

       }

        ser.shutdown();
    }
 
}
