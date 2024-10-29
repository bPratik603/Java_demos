class Prog2 extends Thread{
   public void run(){
      
     for(int i=0;i<10;i++){
        System.out.println("In run");

        try{
           Thread.sleep(1000);
         }catch(InterruptedException ie){
    
         }
     }
   }

     public static void main(String[] args) throws InterruptedException{
        
       Prog2 obj = new Prog2();
       obj.start();

        for(int i=0;i<10;i++){
          System.out.println("In main");
          obj.sleep(1000);
        }
         
     }
}
