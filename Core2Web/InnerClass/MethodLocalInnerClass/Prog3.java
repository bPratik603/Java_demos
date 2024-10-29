class Outer{
   Object m1(){
     System.out.println("In Outer m1");
   

   class Inner{
      void m1(){
         System.out.println("In Inner m1");
      }
   }
      return new Inner();
 }
}


class Prog3{
  public static void main(String args[]){
    Outer obj = new Outer();
     Object obj1 = obj.m1();
     obj1.m1();
  }
}
