class Parent{
  Parent(){
    System.out.println("Inside Parent constructor");
  }

  void fun(int a){
    System.out.println("Inside Parent fun");
  }
}

class Child extends Parent{
   Child(){
   System.out.println("Inside Child constructor");
 }

   void fun(int a){
     System.out.println("Inside Child fun");
  }
}

class Prog2{
  public static void main(String args[]){
     Parent p = new Child();

     p.fun(10);
  }
}
