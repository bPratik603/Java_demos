class Demo{
    void marry(){
       System.out.println("Alia bhat");
    }
}

class Prog1{
  public static void main(String args[]){
    Demo obj = new Demo(){
       void marry(){
         System.out.println("Disha Patni");
       }     
    };
  
   Demo obj1 = new Demo(){
     void marry(){
         System.out.println("Emma Watsan");
     }
   };
     obj.marry();
     obj1.marry();
  }
}
