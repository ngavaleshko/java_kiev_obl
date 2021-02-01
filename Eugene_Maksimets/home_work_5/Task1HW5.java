public class Task1HW5 {

    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        if (num % 2 == 0) {
            System.out.println(num + ": число четное");
        } else {
            System.out.println(num + ": число не четное");
        }
    }
}
