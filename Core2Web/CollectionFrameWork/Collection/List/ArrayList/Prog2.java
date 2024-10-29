import java.util.*;

class CricPlayer{
  int jerNo = 0;
  String name = null;

  CricPlayer(int num,String name){
     
     this.jerNo = num;
     this.name = name;
  }

  public String toString(){
     return jerNo+" : "+name;
  }
}


class Prog2{
   public static void main(String args[]){
     ArrayList al = new ArrayList();

     al.add(new CricPlayer(45,"Rohit"));
     al.add(new CricPlayer(18,"Virat"));
     al.add(new CricPlayer(7,"Dhoni"));

     System.out.println(al);
   }
}
