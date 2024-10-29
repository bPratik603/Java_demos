import java.util.*;

class Prog1{
    public static void main(String[] args){
        
        ArrayList al = new ArrayList();

        al.add(10);
        al.add(20.5f);
        al.add("Shashi");
        al.add(10);

        System.out.println(al);


       //public int size();
       System.out.println(al.size());


      //public boolean isEmpty();
      System.out.println(al.isEmpty());


     //public boolean contains(java.lang.Object);
     System.out.println(al.contains("Shashi"));


      //public int indexOf(java.lang.Object);
       System.out.println(al.indexOf(20.5f));

      //public E get(int)
       System.out.println(al.get(3)); 
 
      //public E set(int,E)
        System.out.println(al.set(3,20));
        System.out.println(al); 

      //public void add(int,E)
       al.add(3,true);
       System.out.println(al);

      //public boolean addAll(java.util.Collection)
       ArrayList al2 = new ArrayList();
        al2.add("Salman");
        al2.add("Sharukh");
        al2.add("Amir"); 

      al.addAll(3,al2);
        System.out.println(al);

      //protected void removeRange(int,int)
      //this method is protected so we have to extends ArrayList and create obj of Prog1 and call it

//       al.removeRange(3,5);
  //     System.out.println(al);

      //public java.lang.Object[]  toArray();
        Object arr[] = al.toArray();
        for(Object data : arr){
           System.out.println(data);
         }
      
    }
}
