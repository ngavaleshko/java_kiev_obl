import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input n :");
        int n = in.nextInt();
        int sum = 0;
        int[] myArray = new int[n];
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(i + 1 + " Input a number: ");
            myArray[i] = in.nextInt();
        }
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        System.out.println(sum);
    }
}
