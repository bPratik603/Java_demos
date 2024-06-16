package if_else;

public class greter_number {
    public static void main(String args[]){
        int n1 = 42;
        int n2 = 32;
        int n3 = 42;

        if(n1>n2 && n1>n3){
            System.out.println(n1+"is greter than "+n2+"and"+n3);
        }else if(n2>n1 && n2>n3){
            System.out.println(n2+" is grete than "+n1+"and"+n3);
        }else if(n3>n1 && n3>n2){
            System.out.println(n3+"is greter than "+n1+"and"+n2);
        }else if(n1==n2){
            System.out.println("n1 "+n1+" and "+n2+" n2 are same");
        }else if(n1 == n3){
            System.out.println("n1 "+n1+" and "+n3+" n3 are same");
        }else if(n2==n3){
            System.out.println("n2 "+n2+" and "+n3+" n3 are same");
        }
    }
}
