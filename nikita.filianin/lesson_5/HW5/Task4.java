public class Task4 {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a < b || a < c) {

            if (a == b && a < c) {
                System.out.println("Минимальные значения: " + a + " и " + b);
            } else if (a == c && a < b) {
                System.out.println("Минимальные значения: " + a + " и " + c);
            } else System.out.println("Минимальное значение: " + a);
        }
        else if (b < a || b < c) {

            if (b == a && b < c) {
                System.out.println("Минимальные значения: " + b + " и " + a);
            } else if (b == c && b < a) {
                System.out.println("Минимальные значения: " + b + " и " + c);
            } else System.out.println("Минимальное значение: " + b);
        }
        else  if (c < a || c < b) {

            if (c == a && c < b) {
                System.out.println("Минимальные значения: " + c + " и " + a);
            } else if (c == b && c < a) {
                System.out.println("Минимальные значения: " + c + " и " + b);
            } else System.out.println("Минимальное значение: " + c);
        }
    }
}