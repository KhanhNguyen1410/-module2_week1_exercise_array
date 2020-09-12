public class SumTheDiagonal {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum1 = 0;
        int sum2 = 0;
        int sum = sum1 + sum2;
        for (int i = 0; i < array.length; i++) {
            sum1 += array[i][i];
            sum2 += array[array.length-1-i][i];
            sum = sum1+sum2;
        }
        System.out.println(sum);

    }
}
