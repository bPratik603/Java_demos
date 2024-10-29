import java.util.*;

class Employee{
   String empName;
   int empId;

   Employee(int empId,String empName){
      this.empName = empName;
      this.empId = empId;
   }

   public String toString(){

      return empId+" : "+empName;
   }
}

class Prog3{
   public static void main(String[] args){
 
     ArrayList al = new ArrayList();

     al.add(new Employee(25,"Kanha"));
     al.add(new Employee(15,"Ashish"));
     al.add(new Employee(22,"Rahul"));

     System.out.println(al);

     Collections.sort(al,(obj1,obj2)->{
                                         return ((Employee)obj1).empName.compareTo(((Employee)obj2).empName);
                                      });

     System.out.println(al);
   }
}


