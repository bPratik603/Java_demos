import java.util.*;

class Prog1{
   public static void main(String[] args){
      
      IdentityHashMap ihm = new IdentityHashMap();

      ihm.put(new Integer(10),"kanha");
      ihm.put(new Integer(10),"Rahul");
      ihm.put(new Integer(10),"Badhe");

      System.out.println(ihm);
   }
}
