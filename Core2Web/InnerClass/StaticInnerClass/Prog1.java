class Outer{
   void m1(){
     System.out.println("In Outer m1");
   }

   static class Inner{
     void m1(){
       System.out.println("In Inner m1");
     }
   }
}

class Prog1{
   public static void main(String args[]){
     Outer obj1 = new Outer();
     obj1.m1();

     Outer.Inner obj2 = new Outer.Inner();
     obj2.m1();

  }
}
