class Demo{
   void fun(int a,float b){
      System.out.println("int-float");
   }

   void fun(float a,int b){
      System.out.println("float-int");
   }
}

class Prog2{
  public static void main(String args[]){
     Demo ch = new Demo();
     ch.fun(10,10);
  }
}


