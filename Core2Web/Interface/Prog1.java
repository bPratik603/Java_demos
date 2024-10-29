interface Parent{
  void m1();
    
}

class Child implements Parent{
   public  void m1(){
        System.out.println("Inside Child m1");
     }
}

class Prog1{
   public static void main(String args[]){
       Parent ch = new Child();
       ch.m1();
   }
}
