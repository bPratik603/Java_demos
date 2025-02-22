class MyThread extends Thread{
     MyThread(ThreadGroup tg,String str){
       super(tg,str);
     }

     public void run(){
       System.out.println(Thread.currentThread());
     }
}


class Prog2{
   public static void main(String[] args){
     
     ThreadGroup pThreadGP = new ThreadGroup("Core2Web");
      
      MyThread obj1 = new MyThread(pThreadGP,"c,cpp,DSA");
      MyThread obj2 = new MyThread(pThreadGP,"java,DSA");
      MyThread obj3 = new MyThread(pThreadGP,"Python,DSA");

       obj1.start();
       obj2.start();
       obj3.start();

      ThreadGroup cThreadGP = new ThreadGroup("Incubator");
     
      MyThread obj4 = new MyThread(cThreadGP,"Flutter");
      MyThread obj5 = new MyThread(cThreadGP,"ReactJS");
      MyThread obj6 = new MyThread(cThreadGP,"SpringBoot");

      obj4.start();
      obj5.start();
      obj6.start();
   }
}
