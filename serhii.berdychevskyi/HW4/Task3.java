public class Task3 {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        System.out.println("Result " + Integer.toString((int) Math.pow(num1, num2), num3));

    }
}
