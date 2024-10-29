import java.util.*;

class AllCursor{
   public static void main(String[] args){

     ArrayList al = new ArrayList();

     al.add(10);
     al.add(20);
     al.add(30);
     al.add(40);

   /*    
   //Iterator
    Iterator itr =  al.iterator();

     while(itr.hasNext()){
       System.out.println(itr.next());
     } 
   */

  /*
    // ListIterator
    ListIterator litr = al.listIterator();

     while(litr.hasNext()){
        System.out.println(litr.next());
     }

     while(litr.hasPrevious()){
       System.out.println(litr.previous());
    }
  */

   //Enumeration
    Enumeration em = al.ArrayList();
    
     System.out.println(em.getClass().getName());

     while(em.hasMoreElements()){
       System.out.println("em.nextElement()");
     }
  
   }
}
