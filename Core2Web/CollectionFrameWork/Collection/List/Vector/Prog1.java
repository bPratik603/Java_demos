import java.util.*;


class MyThread extends Thread{
    public void run(){
       ArrayList ar = new ArrayList();
       ar.add(10);
       ar.add(20);
       ar.add(30);
       ar.add(40);

      Vector v = new Vector(ar);
       v.addElement(10);
       v.addElement(20);
       v.addElement(30);
       v.addElement(40);

      System.out.println(v);
    }
}
class Prog1{
   public static void main(String[] args){
       
          MyThread obj = new MyThread();
          obj.start();

          MyThread obj1 = new MyThread();
          obj1.start();
   }
}
