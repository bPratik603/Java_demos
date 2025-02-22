import java.util.*;

class Employee{
   String name = null;
   float sal = 0.f;

   Employee(String name,float sal){
      this.name = name;
      this.sal = sal;
   }

   public String toString(){
     return "{"+name+" : "+sal+"}";
   }
}

class SortByName implements Comparator<Employee>{
   public int compare(Employee obj1,Employee obj2){
        return obj1.name.compareTo(obj2.name);
   }
}

class SortBySal implements Comparator<Employee>{
   public int compare(Employee obj1,Employee obj2){
     return (int)(obj1.sal - obj2.sal);
   }
}


class Prog2{
   public static void main(String[] args){
    
      ArrayList<Employee> al = new ArrayList<Employee>();

      al.add(new Employee("Kanha",2000.00f));
      al.add(new Employee("Ashish",25000.00f));
      al.add(new Employee("Badhe",15000.00f));
      al.add(new Employee("Rahul",11500));

      System.out.println(al);

      Collections.sort(al,new SortByName());
      System.out.println(al);

      Collections.sort(al,new SortBySal());
      System.out.println(al);
   }
}
