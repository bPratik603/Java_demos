package calculate;

public class Arithmatic{
    int num1;
    int num2;

    public Arithmatic(int num1,int num2){
       this.num1 = num1;
       this.num2 = num2;
    }

    public int add(){
        
       return num1+num2;
    }

    public int sub(){
       return num1-num2;
    }

    public int mul(){
      return num1*num2;
    }

    public int div(){
       return num1/num2;
    }
}
