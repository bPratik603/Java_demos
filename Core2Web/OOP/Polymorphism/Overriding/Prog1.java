class Parent{
  Parent(){
   System.out.println("Inside Parent Constructor");
  }

  void property(){
    System.out.println("Car,flat,Gold");
  }

  void marry(){
    System.out.println("Alia Bhat");
  }
}
class Child extends Parent{
   Child(){
    System.out.println("Inside Child Constructor");
  }

   void marry(){
    System.out.println("Emma Watson");
  }
}

class Prog1{
   public static void main(String[] args){
     Parent p = new Parent();
     p.marry();
  }
}
