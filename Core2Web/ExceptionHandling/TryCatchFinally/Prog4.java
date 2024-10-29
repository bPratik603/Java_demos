class Prog4{
  void fun(int x){
   System.out.println(x);
    fun(++x);
  }

  public static void main(String args[])
   {
      System.out.println("Main starts");
   Prog4 obj = new Prog4();
   
   try{
   obj.fun(1);
   }catch(StackOverflowError obj1){
     System.out.println("Stack Ouverflow");
   }

   System.out.println("Main ends");
  }
}
