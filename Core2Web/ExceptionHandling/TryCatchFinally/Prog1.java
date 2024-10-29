class Prog1{
  public static void main(String[] args){
   System.out.println("Main starts");

   try{
     System.out.println(10/0);
   }catch(NullPointerException obj){
     System.out.println("Exception occured...!");
   }

   System.out.println("Main Ends");
 }
}
