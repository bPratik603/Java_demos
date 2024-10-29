import java.util.*;

class Project{
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
}


class sortByDuration implements Comparator{
    
    public int compare(Object obj1,Object obj2){
       return ((Project)obj1).duration - ((Project)obj2).duration;
    }   
}

class sortByTeamSize implements Comparator{
   
    public int compare(Object obj1,Object obj2){
        return ((Project)obj1).teamSize - ((Project)obj2).teamSize;
    }
}

class Prog3{
   public static void main(String[] args){
     
      PriorityQueue pq = new PriorityQueue(new sortByDuration());
       
        pq.add(new Project("Krushi",4,3));
        pq.add(new Project("SASUR",2,6));
        pq.add(new Project("GramPanchayat",5,4));
        pq.add(new Project("City",5,3));

        System.out.println(pq);

  PriorityQueue pq1 = new PriorityQueue(new sortByTeamSize());

        pq1.add(new Project("Krushi",4,3));
        pq1.add(new Project("SASUR",2,6));
        pq1.add(new Project("GramPanchayat",5,4));
        pq1.add(new Project("City",5,3));

        System.out.println(pq1);
      
   }
}
