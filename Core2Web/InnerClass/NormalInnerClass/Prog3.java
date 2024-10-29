class Outer{
   int x = 10;
   static int y = 20;

     class Inner{
        int a = 30;
      final  static int b = 40;
        void fun(){      
        System.out.println(x);
        System.out.println(y);
	System.out.println(a);
        System.out.println(b);
         }
     }
}

class Prog3{
  public static void main(String[] args){
   // Outer obj = new Outer();
   Outer.Inner obj1 = new Outer().new Inner();
     obj1.fun();
  }
}
