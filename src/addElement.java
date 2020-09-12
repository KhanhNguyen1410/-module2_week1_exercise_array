import java.util.Scanner;

public class addElement {
    public static void main(String[] args) {
        int[]array = {1,2,3,4,5,6,8};
        int[] newArr = new int[array.length+ 1];
        int number;
        Scanner scanner  = new Scanner(System.in);
        System.out.print("enter your number: ");
        number = scanner.nextInt();
        System.out.println("enter index you wanna add ");
        int  index = scanner.nextInt();
        for (int i = 0; i < index; i++) {
            newArr[i]=array[i];
        }
        newArr[index] = number;
        for (int i = index; i < newArr.length ; i++) {
             newArr[i] = array[i-1] ;
        }


        for (int i = 0; i < array.length; i++) {
            System.out.print(newArr[i] + ", ");
        }
    }
}

