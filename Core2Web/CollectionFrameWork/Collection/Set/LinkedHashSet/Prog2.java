import java.util.*;

class CricPlayer{
   int jerNo = 0;
   String name = null;

     CricPlayer(int jerNo,String name){
        this.jerNo = jerNo;
        this.name = name;
     }

    public String toString(){
       return jerNo+" : "+name;
    }
}

class Prog2{
   public static void main(String[] args){
     
       LinkedHashSet lhs = new LinkedHashSet();
       
        lhs.add(new CricPlayer(45,"Rohit"));
        lhs.add(new CricPlayer(18,"Virat"));
        lhs.add(new CricPlayer(7,"Dhoni"));

        System.out.println(lhs);
   }
}
