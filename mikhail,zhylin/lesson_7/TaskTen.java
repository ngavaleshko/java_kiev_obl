import java.util.Arrays;

public class TaskTen {
    public static void main(String[] args) {
        int[] array = {44, 132, 352, 61, 2, 87, 321, 468, 994, 334};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i] + " ");
        }

    }

    public static void bubbleSort(int[] arrayb) {
        int temp;
        boolean sort = false;
        while (!sort) {
            sort = true;
            for (int i = 0; i < arrayb.length - 1; i++) {
                if (arrayb[i] > arrayb[i + 1]) {
                    temp = arrayb[i];
                    arrayb[i] = arrayb[i + 1];
                    arrayb[i + 1] = temp;
                    sort = false;
                }


            }
        }
    }
}
