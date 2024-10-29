import java.util.*;

class Prog3{
  public static void main(String[] args){
     
    IdentityHashMap<String,Integer> h = new IdentityHashMap<>();

     String s1 = new String("Rahul");
     String s2 = new String("Rahul");

     h.put(s1,2);
     h.put(s2,3);

     System.out.println(h);
  }
}
