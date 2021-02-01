import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = {24, 41, 834, 14, 65, 34, 87, 12, 657, 13, 4, 64, 18};
        if (n < 0 || n > array.length) {
            System.out.println("this number is greater than the number of elements in the array");
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum + " sum  " + n + " numbers in array");
    }
}
