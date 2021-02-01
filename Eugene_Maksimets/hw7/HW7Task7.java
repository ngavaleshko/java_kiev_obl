import java.util.Scanner;
import java.util.SplittableRandom;

public class HW7Task7 {
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
            array[i] = random.nextInt(0, 1000);
        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
        resultOneArray(array);
        resultTwoArray(array);
    }

    private static void resultOneArray(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                result += array[i];
            }
        }
        System.out.println("Сумма нечетных элиментов массива = " + result);
    }

    private static void resultTwoArray(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result += array[i];
            }
        }
        System.out.println("Сумма четных элиментов массива = " + result);
    }

}

