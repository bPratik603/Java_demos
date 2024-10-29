class Outer{

  void m1(){
       System.out.println("In Outer m1");
     class Inner{
        void m1(){
            System.out.println("In Inner m1");
        }
     }
      Inner obj = new Inner();
       obj.m1();
  }

    void m2(){
      System.out.println("In Outer m2");
    }
}


class Prog1{
  public static void main(String[] args){
    Outer obj = new Outer();
    obj.m1();
    obj.m2();
  }
}


