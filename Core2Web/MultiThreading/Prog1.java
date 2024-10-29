class Prog1 extends Thread{
   public void run(){
       
       for(int i=0;i<10;i++){
        System.out.println("In run");
       }
   }

  public static void main(String[] args){
      Prog1 obj = new Prog1();

      obj.start();

      for(int i=0;i<100;i++){
           System.out.println("In main");
      }
  }
}
