class Parent{
   Parent(){
     System.out.println("Inside Parent constructor");
     System.out.println(this);  
  }

   void parentProperty(){
       System.out.println("Inside parentProperty");
       System.out.println(this);
   }
}

class Child extends Parent{ 
    Child(){
      System.out.println("Inside Child constructor");
      System.out.println(this);
   }
}

class Prog1{
  public static  void main(String args[]){
      Child ch = new Child();
      ch.parentProperty();

      Parent ph = new Child();
      ph.parentProperty();

      Child obj = new Parent(); 
  }
}


