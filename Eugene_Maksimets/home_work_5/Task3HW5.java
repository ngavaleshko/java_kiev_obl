public class Task3HW5 {
    public static void main(String[] args) {
        int firstNum = Integer.parseInt(args[0]);
        int secondNum = Integer.parseInt(args[1]);
        int resultFirstNum = firstNum - 10;
        int resultSecondNum = secondNum - 10;

        if (result(resultFirstNum) <= result(resultSecondNum)) {
            System.out.println(firstNum);
        } else {
            System.out.println(secondNum);
        }

    }

    public static int result(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}
