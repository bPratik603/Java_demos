import java.util.*;

class IterateMap{
  public static void main(String[] args){
       
     SortedMap sm = new TreeMap();

     sm.put("Ind","India");
    sm.put("Pak","Pakistan");
    sm.put("SL","Srilanka");
    sm.put("Aus","Australia");
    sm.put("Ban","Bangladesh");

    System.out.println(sm);

    Set<Map.Entry> data = sm.entrySet();
    Iterator<Map.Entry> itr = data.iterator();

    while(itr.hasNext()){
        // System.out.println(itr.next());
        Map.Entry abc = itr.next();
        System.out.println(abc.getKey()+" = "+abc.getValue());
    }    

  }
}
