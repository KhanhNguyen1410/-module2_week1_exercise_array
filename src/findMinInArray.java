import java.util.Scanner;

public class findMinInArray {
    public static void main(String[] args) {
        int rows;
        int cols;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your rows: ");
        rows = sc.nextInt();
        System.out.println("enter your cols: ");
        cols = sc.nextInt();
        int[][] array = new int[rows][cols];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("enter element " +i + j+ ": ");
                array[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+ "\t");
            }
        }

        int minArray = findMin(array);
        System.out.println("min element is:"+ minArray);

    }
    static int findMin(int[][] arr){
        int min =  arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        } return min;
    }
}
