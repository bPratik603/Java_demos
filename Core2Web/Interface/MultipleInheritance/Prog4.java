interface Demo1{
   default void fun(){
     System.out.println("Inside Demo1 fun");
   }
}

interface Demo2{
   default void fun(){
      System.out.println("Inside Demo2 fun");
   }
}

class DemoChild implements Demo1,Demo2{
    public void fun(){
      System.out.println("In DemoChild fun");
    }
}

class Prog4{
   public static void main(String[] args){
     
     DemoChild obj1 = new DemoChild();
        obj1.fun();

     Demo1 obj2 = new DemoChild();
        obj2.fun();

     Demo2 obj3 = new DemoChild();
        obj3.fun();
   }
}
