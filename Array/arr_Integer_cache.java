public class arr_Integer_cache {

     static void update(int arr[]){
        arr[2] = 70;
        arr[3] = 80;
    }
    public static void main(String args[]){

        int arr[] = new int[]{10,20,30,40};

        for(int i=0;i<arr.length;i++){
            System.out.println(System.identityHashCode(arr[i]));
        }

        System.out.println();
        int x = 10;
        int y = 20;

        System.out.println(System.identityHashCode(x));
        System.out.println(System.identityHashCode(y));

        System.out.println();

         update(arr);

         for(int i=0;i<arr.length;i++){
            System.out.println(System.identityHashCode(arr[i]));
         }

         System.out.println();

         int a = 70;
         int b = 80;

         System.out.println(System.identityHashCode(a));
         System.out.println(System.identityHashCode(b));

         System.out.println();
         String arr1[] = new String[]{"Ashish","Ashish"};

         System.out.println(System.identityHashCode(arr1[0]));
         System.out.println(System.identityHashCode(arr1[1]));

         System.out.println();

         String str1 = "Ashish";
         String str2 = "Ashish";

         System.out.println(System.identityHashCode(str1));
         System.out.println(System.identityHashCode(str2));

    }
}
