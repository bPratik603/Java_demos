class MyThread extends Thread{
    public void run(){
       System.out.println("In run: "Thread.currentThread());
    }
}

class Prog1{
   public static void main(String args[]){

       System.out.println(Thread.currentThread());

       MyThread obj = new MyThread();
          obj.start();
          try{
          Thread.sleep(2000);
          }catch(InterruptedException ie){
 
          }
       
        Thread.currentThread().setName("Core2Web");
       System.out.println("In Main: "+Thread.currentThread());
   }
}
