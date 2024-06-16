package Exercise3;

public class Add_15 { 
    public static void main(String args[]){
       
        int arr[] = new int[]{10,20,30,40,50,60};

        for (int i = 0; i < arr.length; i++) {
            arr[i]+=15;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
