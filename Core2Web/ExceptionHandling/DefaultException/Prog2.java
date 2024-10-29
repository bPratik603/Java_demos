class Demo{
   void m1(){
     System.out.println("In m1");
   }

   void m2(){
     System.out.println("In m2");
   }
}

class Prog2{
   public static void main(String args[]){
     System.out.println("Main Start");
      Demo obj = new Demo();
      obj.m1();
      obj = null;
      obj.m2();
      System.out.println("Main ends");
 
   }
}
