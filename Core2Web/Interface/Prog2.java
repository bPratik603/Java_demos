interface Demo{
  void fun();
  void gun();
}

abstract class DemoChild implements Demo{
  public void fun(){
    System.out.println("Inside DemoChild fun");
  }
}

class DemoChild1 extends DemoChild{
    public void gun(){
      System.out.println("Inside DemoChild1 gun");
    }
}

class Prog2 {
   public static void main(String[] args){
     Demo d = new DemoChild1();
     d.fun();
     d.gun();
   }
}
