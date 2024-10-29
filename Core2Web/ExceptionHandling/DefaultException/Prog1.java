class Demo{
   void m1(){
      System.out.println("In m1");
      System.out.println(10/0);
      m2();
   }

   void m2(){
      System.out.println("In m2");
   }
}

class Prog1{
   public static void main(String args[]){
      System.out.println("Main start");
      Demo obj = new Demo();
      obj.m1();
      System.out.println("Main end");
   }
}
