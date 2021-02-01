import java.util.Scanner;
import java.util.SplittableRandom;

public class HW7Task6 {
    public static void main(String[] args) {
        makeArray();

    }


    private static void makeArray() {
        System.out.println("Введите размер массива: ");
        Scanner scanArray = new Scanner(System.in);
        int lengthArray = scanArray.nextInt();
        int[] array = new int[lengthArray];
        for (int i = 0; i < array.length; i++) {
            SplittableRandom random = new SplittableRandom();
            array[i] = random.nextInt(-999, 1000);
        }
        maxNumberArray(array);
        minNumberArray(array);

    }

    private static void maxNumberArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];

        }
        System.out.println("Значение максимального элемента массива = " + max);
    }

    private static void minNumberArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];


        }
        System.out.println("Значение минимальтного элемента массива = " + min);
    }
}

