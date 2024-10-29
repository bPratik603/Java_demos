class Parent{
    int a = 10;
    static int b = 20;

    static{
      System.out.println("Inside static block 1");
   }
    Parent(){
       System.out.println("Inside Parent constructor");
   }

   void methodOne(){
     System.out.println("Inside methodOne");
     System.out.println(a);
     System.out.println(b);
   }

   void methodTwo(){
    System.out.println("inside methodTwo");
    System.out.println(y);
  }
}

class Child{
     static{
     System.out.println("Inside static block 2");
   }

   Child(){
     System.out.println("Inside Child constructor");
   }
 }

class Prog3{
  public static void main(String args[]){
    Child ch = new Child();
    ch.methodOne();
    ch.methodTwo();
  }
}
