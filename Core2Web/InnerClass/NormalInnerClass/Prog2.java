class Outer{
  int x = 10;
  static int y = 20;
  class Inner{
    void fun2(){
      System.out.println(x);
      System.out.println(y);
      fun1();
    }
  }

   void fun1(){
     System.out.println("fun1-Inner");
   }
}


class Prog2{
   public static void main(String[] args){
     Outer obj = new Outer();
   
     Outer.Inner obj1 = obj.new Inner();
        obj1.fun2();
  }
}
