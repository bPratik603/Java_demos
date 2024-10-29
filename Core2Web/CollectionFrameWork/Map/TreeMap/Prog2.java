import java.util.*;

class PlatForm implements Comparable{
   String name = null;
   int foundYear = 0;

   PlatForm(String name,int foundYear){
      this.name = name;
      this.foundYear = foundYear;
   }

   public String toString(){
      return "{"+name+" : "+foundYear+"}";
   }

   public int compareTo(Object obj){
         return foundYear - ((PlatForm)obj).foundYear;
   }
}


class Prog2{
   public static void main(String[] args){
      
        TreeMap tm = new TreeMap();

        tm.put(new PlatForm("YouTube",2005),"Google");
        tm.put(new PlatForm("Instagram",2010),"Meta");
        tm.put(new PlatForm("Facebook",2004),"Meta");
        tm.put(new PlatForm("ChatGPT",2022),"OpenAI");

        System.out.println(tm);
   }
}
