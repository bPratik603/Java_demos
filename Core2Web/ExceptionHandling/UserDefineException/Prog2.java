import java.util.Scanner;


class DataOverflowException extends RuntimeException{
	
	DataOverflowException(String msg){
            super(msg);
	}
}

class DataUnderflowException extends RuntimeException{
	
	DataUnderflowException(String msg){
          super(msg);
	}
}

class Prog2{
    
	public static void main(String args[]){
           Scanner sc = new Scanner(System.in);

           int arr[] = new int[5];

           for(int i=0;i<5;i++){
	       
               int data = sc.nextInt();
	       if(data < 0 ){
                 throw  new  DataUnderflowException("Mitra data 0 peksha lahan ahe");
	       }

	       if(data > 100){
	         throw  new  DataOverflowException("Mitra data 100 peksha motha ahe");
	       }
	       arr[i] = data;
	   }

         for(int i=0;i<5;i++){
            System.out.println(arr[i]);
	 }
	}   
}
