interface Demo1{
   void fun();
}

interface Demo2{
   void fun();
}

class DemoChild implements Demo1,Demo2{
    public  void fun(){
      System.out.println("Inside ChildDemo fun");
    }
}

class Prog1{
   public static void main(String args[]){
     Demo1 obj = new DemoChild();
       obj.fun();
   }
}
