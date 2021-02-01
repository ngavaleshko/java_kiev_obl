import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[] arr = {56, 234, 122, -8, 190, 639, 12, -49, 0, -88, 594, 4};
        Arrays.sort(arr);
        System.out.println("Пять минимальных элиментов массива: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}