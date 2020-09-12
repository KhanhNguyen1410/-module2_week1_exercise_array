public class aggregationArray {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {0,2,4,6,8};
        int[] arr3 = new int[10];

        for (int i = 0; i < arr1.length; i++) {
               arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + ", ");
        }
        System.out.println();
        for (int i = arr3[arr2.length],j=0; j <arr2.length; i++,j++) {
            arr3[i]= arr2[j];
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + ", ");
        }

    }
}
