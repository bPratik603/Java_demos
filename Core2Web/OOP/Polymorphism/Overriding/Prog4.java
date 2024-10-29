class Parent{
  Object fun(){
    System.out.println("Inside Demo fun");
  }
}

class Child extends Parent{
  String fun(){
    System.out.println("Inside override fun");
  }
}

class Prog4{
  public static void main(String[] args){
    Child p = new Child();
    p.fun();
  }
}
