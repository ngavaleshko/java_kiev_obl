public class Task2HW5 {
    public static void main(String[] args) {
        int firstNum = Integer.parseInt(args[0]);
        int secondNum = Integer.parseInt(args[1]);
        int result = firstNum % secondNum;
        if (result == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
