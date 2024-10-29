import java.util.*;

class Prog1{
  public static void main(String[] args){
    
    ArrayList al = new ArrayList();
    al.add("Kanha");
    al.add("Rahul");
    al.add("Ashish");

    Iterator itr = al.iterator();
    System.out.println(itr.getClass().getName());

    while(itr.hasNext()){
      if("Rahul".equals(itr.next()))
            itr.remove();
      System.out.println(itr.next());
      
    } 
    System.out.println(al);

  }
}
