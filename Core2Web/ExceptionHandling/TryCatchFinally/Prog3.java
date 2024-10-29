class Prog3{
  void m1(){
    System.out.println("In m1");
  }
 
  void m2(){
    System.out.println("In m2");
  }

  public static void main(String[] args){
    System.out.println("Main starts");
    Prog3 obj = new Prog3();
   
    obj.m1();
    obj = null;
    try{
      obj.m2();
    }catch(NullPointerException obj1){
      System.out.println("Here");
    }finally{
      System.out.println("connection closed");
    }

    System.out.println("Main ends");
  }
}
