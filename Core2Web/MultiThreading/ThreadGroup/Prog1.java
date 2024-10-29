class MyThread extends Thread{

     MyThread(String str){
        super(str);
     }
    public void run(){
         System.out.println(currentThread().getName());
    }
}

class MyThread1 extends Thread{

     MyThread1(String str){
        super(str);
     }
    public void run(){
         System.out.println(currentThread().getName());
    }
}

class Prog1{
  public static  void main(String[] args){
     
     MyThread obj = new MyThread("xyz");
      obj.start();

     MyThread1 obj1 = new MyThread1("xyz");
      obj1.start();
  }
}
