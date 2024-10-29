class Demo extends Thread{
    public void run(){
        System.out.println("In Demo:"+Thread.currentThread().getName());
    }
}

class MyThread extends Thread{
   public void run(){
      System.out.println("In MyThread: "+Thread.currentThread().getName());

      Demo obj = new Demo();

      obj.start();
   }
}

class Prog4{
   public static void main(String[] args){
       
      System.out.println("In main: "+Thread.currentThread().getName());

      MyThread obj = new MyThread();
       obj.start();
   }
}
