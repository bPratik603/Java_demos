class Demo{
  static void fun(){
      System.out.println("In Demo fun");
  }
}

class Demo1 extends Demo{
   
}

class Prog3{
  public static void main(String[] args){
    Demo obj = new Demo1();
    obj.fun();
  }
}
