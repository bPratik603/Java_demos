import java.util.*;

class Demo{
   String name = null;

   Demo(String name){
      this.name = name;
   }

   public String toString(){
      return name;
   }

   public void finalize(){
         System.out.println("Notify");
   }
}


class Prog1{
   public static void main(String args[]){
     
      WeakHashMap whm = new WeakHashMap();

       Demo obj1 = new Demo("Core2Web");
       Demo obj2 = new Demo("BienCaps");
       Demo obj3 = new Demo("Incubator");

       whm.put(obj1,2016);
       whm.put(obj2,2019);
       whm.put(obj3,2023);

       obj1 = null;
       System.gc();

       System.out.println(whm);
   }
}
