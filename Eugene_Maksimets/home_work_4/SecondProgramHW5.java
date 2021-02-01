

public class SecondProgramHW5 {

    public static void main(String[] args) {
        final String PRINT_TEXT2 = "Максимально число = ";
        int firstNum = Integer.parseInt(args[0]);
        int secondNum = Integer.parseInt(args[1]);
        int thirdNum = Integer.parseInt(args[2]);
        if (firstNum >= secondNum && firstNum >= thirdNum) {
            System.out.println(PRINT_TEXT2 + firstNum);
        } else if (secondNum >= firstNum && secondNum >= thirdNum) {
            System.out.println(PRINT_TEXT2 + secondNum);
        } else {
            System.out.println(PRINT_TEXT2 + thirdNum);
        }

    }
}
