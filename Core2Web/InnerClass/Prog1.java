class Demo{
  Demo(){
    System.out.println("In constructor Demo");
  }
}

class DemoChild extends Demo{
  DemoChild(){
     System.out.println("In DemoChild constructor");
  }
}

class Parent{
  Parent(){
    System.out.println("In Parent constructor");
  }

  Demo m1(){
    System.out.println("In Parent m1");
    return new Demo();
  }
}

class Child extends Parent{
  Child(){
    System.out.println("In Child constructor");
  }

  DemoChild m1(){
    System.out.println("In Child m1");
     return new DemoChild();
  }
}

class Prog1{
   public static void main(String[] args){
      Parent p = new Child();
       p.m1();
   }
}
