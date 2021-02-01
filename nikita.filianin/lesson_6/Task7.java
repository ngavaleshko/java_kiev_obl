public class Task7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        getResult(arr);
    }
    static void getResult(int[] arr) {
        for (int j = 0; j < arr.length; j++){
            int even = 0;
            int odd = 0;
            for (int k = 0; k < arr.length; k++){
                if ((arr[k] % 2) == 0) {
                    even += arr[k];
                }
                else {
                    odd += arr[k];
                }

            }
            System.out.println("Сумма чётных: " + even);
            System.out.println("Сумма нечётных: " + odd);
            break;
        }
    }
}