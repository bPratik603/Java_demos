import java.util.*;

class Prog4{
   public static void main(String[] args){
      
     SortedSet ss = new TreeSet();

      ss.add("Kanha");
      ss.add("Rajesh");
      ss.add("Rahul");
      ss.add("Ashish");
      ss.add("Badhe");

      System.out.println(ss);
      
      System.out.println(ss.headSet("Kanha"));
      System.out.println(ss.headSet("Kanha"));
      System.out.println(ss.subSet("Ashish","Rahul"));
   }
}
