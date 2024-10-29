

class Demo{
    String name = null;
    
     Demo(String str){
       this.name = str;
     }

     public String toString(){
         return name;
     }

     public void finalize(){
         System.out.println("Notify");
     }
}

class Prog1{
   public static void main(String[] args){
       
      Demo obj1 = new Demo("Core2Web");
      Demo obj2 = new Demo("Biencaps");
      Demo obj3 = new Demo("Incubator");

      System.out.println(obj1);
      System.out.println(obj2);
      System.out.println(obj3);


      obj1 = null;
      obj2 = null;


      System.gc();

      System.out.println("In Main");
   }
}
