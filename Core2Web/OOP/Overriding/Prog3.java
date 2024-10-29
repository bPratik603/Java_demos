class Parent{
  static void fun(){
    System.out.println("Inside Parent fun");
  }
}

class Child extends Parent{
  static void fun(){
    System.out.println("Inside Child fun");
  }
}

class Prog3{
  public static void main(String[] args){
     Parent obj = new Child();
     Parent.fun();

  }
}
