class SingleTon{
  static SingleTon obj = new SingleTon();
  
   private SingleTon(){
     System.out.println("Constructor");
   }

   static SingleTon getObject(){
     return obj;
   }
}

class SingleTonDesignPattern{
   public static void main(String args[]){
     SingleTon obj = SingleTon.getObject();
     System.out.println(obj);

     SingleTon obj1 = SingleTon.getObject();
     System.out.println(obj1);

     SingleTon obj2 = SingleTon.getObject();
     System.out.println(obj2);
    
  }
}
