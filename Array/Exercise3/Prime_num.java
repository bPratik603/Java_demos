package Exercise3;

public class Prime_num {
    
    public static void main(String[] args) {
        
        int arr[] = new int[]{5,7,9,11,15,19,90};

        

        for(int i=0;i<arr.length;i++){

            int count =0;

            for(int j=1;j<=arr[i];j++){
                if(arr[i]%j==0){
                    count++;
                }
                
                if(count > 2){
                    break;
                }
            }

            if(count == 2){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
