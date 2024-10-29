import java.io.*;

class Player implements Serializable{
   
    int jerNo;
    String pName;

    Player(String pName,int jerNo){
         this.jerNo = jerNo;
	 this.pName = pName;
    }
}


class Prog1
{
    public static void main(String[] args) throws FileNotFoundException,IOException{

       Player obj1 = new Player("Rohit",45);
       Player obj2 = new Player("Virat",18);

       FileOutputStream fos = new FileOutputStream("PlayerData.txt");

       ObjectOutputStream oos = new ObjectOutputStream(fos);

       oos.writeObject(obj1);
       oos.writeObject(obj2);

       fos.close();
       oos.close();
    }
}
