class Demo extends Thread{
   public void run(){
     System.out.println(Thread.currentThread().getName());
   }
}

class Prog3{
  public static void main(String[] args){
     Demo obj = new Demo();
       obj.start();
       obj.yield();

     System.out.println(Thread.currentThread().getName());
  }
}
