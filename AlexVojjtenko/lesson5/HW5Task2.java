public class HW5Task2 {

    public static void main(String[] args) {
        int numberOne = Integer.parseInt(args[0]);
        int numberTwo = Integer.parseInt(args[1]);

        if (numberOne % numberTwo == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
