
import java.util.*;

class Prog1{
  public static void main(String args[]){
     
     LinkedHashMap lhm = new LinkedHashMap();

     lhm.put("java",".java");
     lhm.put("Python",".py");
     lhm.put("Dart",".dart");
     lhm.put("Dart",".c");

     System.out.println(lhm);

     System.out.println(lhm.get("Python"));

     System.out.println(lhm.keySet());

     System.out.println(lhm.values());

     System.out.println(lhm.entrySet());

  }
}
