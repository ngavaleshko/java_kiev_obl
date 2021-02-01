public class HW5Task3 {

    public static void main(String[] args) {
        int numberOne = Integer.parseInt(args[0]);
        int numberTwo = Integer.parseInt(args[1]);

        if (Math.abs(numberOne - 10) > Math.abs(numberTwo - 10)) {
            System.out.println(numberTwo);
        } else {
            System.out.println(numberOne);
        }
    }
}
