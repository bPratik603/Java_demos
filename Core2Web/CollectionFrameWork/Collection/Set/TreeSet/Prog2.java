import java.util.*;


class MyClass implements Comparable{
    
     String name = null;
     
     MyClass(String name){
          this.name = name;
     } 

     public int compareTo(Object obj){
        return name.compareTo(((MyClass)obj).name);
     }


    public String toString(){
         return name; 
    }
}

class Prog2{
   public static void main(String[] args){
     
      TreeSet ts = new TreeSet();

      ts.add(new MyClass("Kanha"));
      ts.add(new MyClass("Ashish"));
      ts.add(new MyClass("Rahul"));
      ts.add(new MyClass("Badhe"));

      System.out.println(ts);
  }
}
