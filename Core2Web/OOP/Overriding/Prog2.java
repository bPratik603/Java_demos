class Parent{
   void  fun(){
    System.out.println("Inside Parent fun");
  }
}

class Child extends Parent{
  final void fun(){
     System.out.println("Inside Child fun");
   }
}

class Prog2{
   public static void main(String args[]){
      Parent obj1 = new Child();
      obj1.fun();
   }
}
