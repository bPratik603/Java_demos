import java.util.*;

class Prog1{
  public static void main(String[] args){
   
     ArrayList al = new ArrayList();

     al.add("Kanha");
     al.add("Ashish");
     al.add("Badhe");
     al.add("Shashi");
     al.add("Rahul");

     System.out.println(al);


     Collections.sort(al);
     System.out.println(al);
  }
}
