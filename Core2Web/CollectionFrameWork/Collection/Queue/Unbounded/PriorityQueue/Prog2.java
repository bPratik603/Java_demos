import java.util.*;

class Project implements Comparable{
   String proName;
   int teamSize;
   int duration;

   Project(String proName,int teamSize,int duration){
        
       this.proName = proName;
       this.teamSize = teamSize;
       this.duration = duration;
   }

   public String toString(){
      return "{"+proName+" : "+teamSize+" : "+duration+"}";
   }

  public int compareTo(Object obj){
      return  proName.compareTo(((Project)obj).proName);
  }
}

class Prog2{
   public static void main(String args[]){
     
      PriorityQueue pq = new PriorityQueue();
    
	pq.add(new Project("Krush",4,3));
        pq.add(new Project("SASUR",2,6));
        pq.add(new Project("GramPanchayat",5,4));
        pq.add(new Project("City",5,3));
        
        System.out.println(pq);
   }
}
