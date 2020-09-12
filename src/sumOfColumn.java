import java.util.Scanner;

public class sumOfColumn {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{5,6,8},{9,7,4}};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter col wanna count");
        int sumCol = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
             sum += arr[i][sumCol];
        }
        System.out.println("sum of column" + sumCol + " is:" + sum);
    }
}
