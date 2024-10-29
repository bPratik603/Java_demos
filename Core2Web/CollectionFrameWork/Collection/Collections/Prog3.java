import java.util.*;

class Movies{
   String name = null;
   double totcoll = 0;
   float imdbRating = 0.0f;

   Movies(String name,double totcoll,float imdbRating){
       this.name = name;
       this.totcoll = totcoll;
       this.imdbRating = imdbRating;

   }

   public String toString(){
      return "{"+name+" , "+totcoll+" , "+imdbRating+"}";
   }
}

class SortByName implements Comparator{
   
    public int compare(Object obj1,Object obj2){
      return ((Movies)obj1).name.compareTo(((Movies)obj2).name);
    }
}

class SortByColl implements Comparator{
   
     public int compare(Object obj1,Object obj2){
          return (int)((((Movies)obj1).totcoll) - (((Movies)obj2).totcoll));
     }
}

class SortByIMDB implements Comparator{
    
    public int compare(Object obj1,Object obj2){
      return (int)((((Movies)obj1).imdbRating) - (((Movies)obj2).imdbRating));
    }
}

class Prog3{
  public static void main(String[] args){
       
      ArrayList al = new ArrayList();

      al.add(new Movies("RHTM",200.00,8.8f));
      al.add(new Movies("Ved",75.00,7.5f));
      al.add(new Movies("Sairat",100.00,8.9f));
      al.add(new Movies("Bajrangi",500.00,9.9f));

      System.out.println(al);

      Collections.sort(al,new SortByName());
      System.out.println(al);

      Collections.sort(al,new SortByColl());
      System.out.println(al);

      Collections.sort(al,new SortByIMDB());
      System.out.println(al);
      
  }
}















