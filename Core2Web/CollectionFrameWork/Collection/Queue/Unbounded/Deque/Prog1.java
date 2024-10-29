import java.util.*;

class Prog1{
   public static void main(String[] args){
     
      Deque dp = new ArrayDeque();
  
      dp.offer(10);
      dp.offer(20);
      dp.offer(30);
      dp.offer(40);

      Deque dp1 = new ArrayDeque();

      dp1.offer(10);
      dp1.offer(20);
      dp1.offer(30);
      dp1.offer(40);

      System.out.println(dp);

      dp.offerFirst(5);
      dp.offerLast(55);

      System.out.println(dp);

      System.out.println(dp.pollFirst());
      System.out.println(dp.pollLast());

      System.out.println(dp);

      Iterator itr = dp.iterator();
      while(itr.hasNext()){
        System.out.println(itr.next());
      }

      Iterator itr1 = dp.descendingIterator();
      while(itr1.hasNext()){
          System.out.println(itr1.next());
      }
   }
}
