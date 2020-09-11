import java.util.Scanner;

public class deleteElement {
    public static void main(String[] args) {
        int[] array = {10,9,8,7,6,5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number");
        int number = scanner.nextInt();
        int index = del(array,number);
        for (int i = index; i <array.length-1 ; i++) {
            array[i] = array[i + 1];
        } array[array.length - 1] = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print( array[i]+ ", ");
        }
    }
    public static int del(int[]arr,int number){
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]){
                index = i;
            }
        }
        return index;
    }
}
