interface Demo1{
    void fun(){
     System.out.println("In Demo1 fun");
   }
}

interface Demo2{
    void fun(){
     System.out.println("IN Demo2 fun");
   }
}

class DemoChild implements Demo1,Demo2{
  
}

class Prog3{
  public static void main(String args[]){
     DemoChild obj = new DemoChild();
     obj.fun();
  }
}
