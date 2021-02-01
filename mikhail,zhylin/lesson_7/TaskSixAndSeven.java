
public class TaskSixAndSeven {
    public static void main(String[] args) {
        int[] array = {4, 21, 14, 89, 28, 9, 92, 2, 15, 18};


        elementMinMax(array);
        sumEvenOddNumbers(array);
    }

    private static void sumEvenOddNumbers(int[] array) {
        int even = 0;
        int odd = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                even = even + j;
            } else {
                odd = odd + j;
            }

        }
        System.out.println("sum  of even number..." + even + " and sum of  odd number " + odd);
    }

    private static void elementMinMax(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int j : array) {
            if (j <= min) {
                min = j;
            }
            if (j >= max) {
                max = j;
            }
        }
        System.out.println("min element of array is... " + min + " max element of array is..." + max);
    }
}
