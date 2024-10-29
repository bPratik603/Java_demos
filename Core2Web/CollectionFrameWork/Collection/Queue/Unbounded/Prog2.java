import java.util.*;


class Prog2{
  public static void main(String[] args){
     
      PriorityQueue pq = new PriorityQueue();

      pq.offer(20);
      pq.offer(10);
      pq.offer(50);
      pq.offer(30);
      pq.offer(40);

      System.out.println(pq);

      System.out.println(pq.poll());
      System.out.println(pq);
       
     PriorityQueue pq1 = new PriorityQueue();
     
     pq1.add(20);
     pq1.add(10);
     pq1.add(50);
     pq1.add(30);
     pq1.add(40);

     System.out.println(pq1);
      
     System.out.println(pq1.poll());
     System.out.println(pq1);
  }
}
