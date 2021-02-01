import java.util.SplittableRandom;

public class HW7Task10 {
    public static void main(String[] args) {
        int[] array = new int[20];
        int temp;
        for (int i = 0; i < array.length; i++) {
            SplittableRandom random = new SplittableRandom();
            array[i] = random.nextInt(0, 1000);
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                i = -1;
            }
        }

        System.out.println("Пять минимальных элиментов массива: " + array[0] + ", " + array[1] + ", " + array[2]
                + ", " + array[3] + ", " + array[4]);
    }
}
