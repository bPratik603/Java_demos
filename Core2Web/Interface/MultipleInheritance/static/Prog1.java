interface Demo{
   static void fun(){
      System.out.println("In Demo fun");
   }
}

class DemoChild implements Demo{
   
}

class Prog1{
  public static void main(String[] args){
    DemoChild obj = new DemoChild();
      obj.fun();
  }
}