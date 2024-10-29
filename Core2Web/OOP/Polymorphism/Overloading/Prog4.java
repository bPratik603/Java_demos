class Demo{
  void fun(Object str){
      System.out.println("Object");
  }

  void fun(String str){
    System.out.println("String");
  }

  void fun(StringBuffer str){
    System.out.println("StringBuffer");
  }
}

class Prog4{
  public static void main(String args[]){
    Demo d = new Demo();
    d.fun("Core2Web");
    d.fun(new StringBuffer("Core2Web"));
    d.fun(null);
  }
}
