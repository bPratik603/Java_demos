public class for_each {
    public static void main(String ... args){

        int arr[] = new int[]{10,20,30,40};
        
        int arr1[] = new int[]{10,20,30,40};

        Float arr2[] = new Float[]{10f,20f,30f,40f};
        double arr3[] = new double[]{10,20,30,40};

        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }

        // for(int x : arr){
        //     System.out.println(x);
        // }

        System.out.println(arr);
        System.out.println(arr2);


    }
}
