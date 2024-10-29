class Prog3 extends Thread{
   public void run(){
     
     System.out.println("In run");

     System.out.println(Thread.currentThread().getName());
  }

   public void start(){
     run();
   }

 
    public static void main(String[] args){
       Prog3 obj = new Prog3();

       obj.start();

       System.out.println(Thread.currentThread().getName());
    }
}
