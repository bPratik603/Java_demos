import java.util.*;

class PlatForm{
   String name = null;
   int foundYear = 0;

   PlatForm(String name,int foundYear){
      this.name = name;
      this.foundYear = foundYear;
   }

   public String toString(){
       return "{"+name+" : "+foundYear+"}";
   }

   
}

class SortByName implements Comparator{
   public int compare(Object obj1,Object obj2){
     
        return ((PlatForm)obj1).name.compareTo(((PlatForm)obj2).name);
   }
}

class Prog3{
   public static void main(String[] args){
   
     TreeMap tm = new TreeMap(new SortByName());

        tm.put(new PlatForm("YouTube",2005),"Google");
        tm.put(new PlatForm("Instagram",2010),"Meta");
        tm.put(new PlatForm("Facebook",2004),"Meta");
        tm.put(new PlatForm("ChatGPT",2022),"OpenAI");

        System.out.println(tm);
   }
}
