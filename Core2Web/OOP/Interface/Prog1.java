abstract class Parent{
   Parent(){
    System.out.println("Inside Parent constructor");
   }

   void property(){
     System.out.println("This is a concreat method");
   }
   abstract void marrage();
}

class Child extends Parent{
    void fun(){
      System.out.println("Inside Child abstract method");
    }   
}

class Prog1{
    public static void main(String args[]){
        Parent obj = new Child();
        obj.property();
        obj.fun();
    }
}


