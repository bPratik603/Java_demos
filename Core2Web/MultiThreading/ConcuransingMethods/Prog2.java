class MyThread extends Thread{
   
    static Thread nmMain = new Thread();
  public void run(){
     for(int i=0;i<10;i++){
        try{
           nmMain.join();
        System.out.println("In run");
         }catch(InterruptedException ie){

         }
     }
  }
}


class Prog2{
   public static void main(String args[]) throws InterruptedException{
       
      MyThread obj = new MyThread();
       obj.start();
       obj.join();
       
      for(int i=0;i<10;i++){
          System.out.println("In main");
      }
   }
}
