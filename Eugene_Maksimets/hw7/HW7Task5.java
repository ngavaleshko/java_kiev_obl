import java.util.Scanner;
import java.util.SplittableRandom;

public class HW7Task5 {
    public static void main(String[] args) {

        makeArray();

    }


    private static void makeArray() {
        System.out.println("Введите размер массива: ");
        Scanner scanArray = new Scanner(System.in);
        int lengthArray = scanArray.nextInt();
        System.out.println("Введите количество элементов масива, которые нужно сложить: ");
        int numberSum = scanArray.nextInt();
        int[] array = new int[lengthArray];
        for (int i = 0; i < array.length; i++) {
            SplittableRandom random = new SplittableRandom();
            array[i] = random.nextInt(0, 1000);
        }
        sumNumberArray(array, numberSum);
    }

    private static void sumNumberArray(int[] array, int numberSum) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
        int result = 0;
        for (int i = 0; i < numberSum; i++) {
            result += array[i];
        }
        System.out.println("Сумма первых " + numberSum + "-х элементов массива = " + result);
    }
}
