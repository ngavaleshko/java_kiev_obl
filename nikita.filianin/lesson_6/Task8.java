public class Task8 {
    public static void main(String[] args) {
        for (int i = 100000; i <= 999999; i++) {
            int num1 = i / 100000;
            int num2 = (i / 10000) % 10;
            int num3 = (i / 1000) % 10;
            int num4 = (i / 100) % 10;
            int num5 = (i / 10) % 10;
            int num6 = i % 10;
            if (num1 + num2 + num3 == num4 + num5 + num6) {
                System.out.println(i);

            }
        }
    }
}