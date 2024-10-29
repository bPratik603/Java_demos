import java.util.*;

class Movies implements Comparable{
    
     String name = null;
     float totcoll = 0.0f;

     Movies(String name,float totcoll){
        this.name = name;
        this.totcoll = totcoll;
     }

     public int compareTo(Object obj){
        return -(name.compareTo(((Movies)obj).name));
     }

    public String toString(){
        return "{"+name+" : "+totcoll+"}";
    }
}

class Prog3{
   public static void main(String[] args){
     
       TreeSet ts = new TreeSet();
  
       ts.add(new Movies("Gadar2",150.000f));
       ts.add(new Movies("OMG2",120.000f));
       ts.add(new Movies("Jailer",250.000f));

       System.out.println(ts);
   }
}
