class Parent{
   static int x = 10;
   static{
      System.out.println("Inside Parent constructor");
  }

  void access(){
     System.out.println(x);
  }
}

class Child extends Parent{
   
    Child(){
       System.out.println("Inside Child constructor");
      
 }

  void childProperty(){
   access();
   }
}

class Prog2{
   public static void main(String args[]){
      Child ch = new Child();

      ch.childProperty();
  }
}
