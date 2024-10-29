class Outer{
   class Inner{
     void m1(){
       System.out.println("In Inner m1");
     }
   }

   void m2(){
     System.out.println("In Outer m2");
   }
}

class Prog1{
  public static void main(String[] args){ 
   Outer obj = new Outer();
         obj.m2();

   Outer.Inner obj1 = new Outer().new Inner();
         obj1.m1();
  }
}
