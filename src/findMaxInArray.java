public class findMaxInArray {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{8,5,7},{10,52,34}};
        int max = findMax(array);
        System.out.println("max element in array is: "+ max);
    }
    static int findMax(int[][] arr){
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        } return max;
    }
}
