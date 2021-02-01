import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = {56, 234, 122, -8, 190, 639, 12, -49, 0, -88, 594, 4};
        Arrays.sort(arr);
        System.out.println("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Значение максимального элемента массива: " + arr[0]);
        System.out.println("Значение минимального элемента массива: " + arr[arr.length - 1]);
    }
}