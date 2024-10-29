class MyThread extends Thread{
    MyThread(ThreadGroup tg,String str){
         super(tg,str);
    }

    public void run(){
       System.out.println(Thread.currentThread());     
      
       try{
           Thread.sleep(2000);
       }catch(InterruptedException ie){
            System.out.println(ie.toString());
       }
    }
}

class Prog3{
   public static void main(String[] args) throws InterruptedException{
      
      ThreadGroup pThreadGroup = new ThreadGroup("India");
 
      MyThread t1 = new MyThread(pThreadGroup,"Maharashtra");
      MyThread t2 = new MyThread(pThreadGroup,"Goa");

       t1.start();
       t2.start();

      ThreadGroup cThreadGroup1 = new ThreadGroup("Pakistan");
      
      MyThread t3 = new MyThread(cThreadGroup1,"Karachi");
      MyThread t4 = new MyThread(cThreadGroup1,"Lahor");

      t3.start();
      t4.start(); 

      ThreadGroup cThreadGroup2 = new ThreadGroup("Bangladesh");

      MyThread t5 = new MyThread(cThreadGroup2,"Dhaka");
      MyThread t6 = new MyThread(cThreadGroup2,"Mirpur");

      t5.start();
      t6.start();

      cThreadGroup2.interrupt();

      System.out.println(cThreadGroup2.activeCount());
      System.out.println(cThreadGroup2.activeGroupCount());
    }
}
