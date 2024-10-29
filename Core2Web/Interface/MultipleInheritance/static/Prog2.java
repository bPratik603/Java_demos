class Demo{
  static void fun(){
    System.out.println("In Demo fun");
  }
}

class DemoChild extends Demo{

}

class Prog2{
  public static void main(String args[]){
     DemoChild obj = new DemoChild();
       obj.fun();
  }
}
