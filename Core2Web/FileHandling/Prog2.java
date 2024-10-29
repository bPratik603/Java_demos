import java.io.*;

class Prog2{
  public static void main(String[] args){

    File obj = new File("/home/ubuntu/Documents/Core2Web/FileHandling");

     System.out.println(obj.exists());

     String[] files = obj.list();

     int count1=0,count2=0;

     for(String file : files){
      
         File f = new File(file);

         if(f.isFile())
            count1++;

         if(f.isDirectory())
            count2++;
           
     }

     System.out.println("Number of files : "+count1);
     System.out.println("Number of Directory : "+count2);
  }
}
