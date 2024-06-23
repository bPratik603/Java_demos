public class Prog2 {
    public static void main(String args[]){

        int arr1[] = {10,200,300};
        int arr2[] = {10,200,300};

        System.out.println("arr1:");
        System.out.println(System.identityHashCode(arr1[0]));
        System.out.println(System.identityHashCode(arr1[1]));
        System.out.println(System.identityHashCode(arr1[2]));

        System.out.println("arr2:");
        System.out.println(System.identityHashCode(arr2[0]));
        System.out.println(System.identityHashCode(arr2[1]));
        System.out.println(System.identityHashCode(arr2[2]));

        int arr3[] ={10,200,300};
        Integer arr4[] = {10,200,300};

        System.out.println("arr3:");
        System.out.println(System.identityHashCode(arr3[0]));
        System.out.println(System.identityHashCode(arr3[1]));
        System.out.println(System.identityHashCode(arr3[2]));

        System.out.println("arr4:");
        System.out.println(System.identityHashCode(arr4[0]));
        System.out.println(System.identityHashCode(arr4[1]));
        System.out.println(System.identityHashCode(arr4[2]));
    }
}
