class IPL{
  void matchInfo(String t1,String t2){
   System.out.println(t1+" vs "+t2);
 }

  void matchInfo(String t1,String t2,String venue){
   System.out.println(t1+" vs "+t2+" "+venue);
  }
}

class Prog1{
  public static void main(String args[]){
    IPL ipl2023 = new IPL();
    ipl2023.matchInfo("mi","CSK");
    ipl2023.matchInfo("MI","CSK","Wankhede");
  }
}
