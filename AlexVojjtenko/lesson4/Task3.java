public class Task3 {

    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);
        int thirdNumber = Integer.parseInt(args[2]);
        int powNumber = (int) Math.pow(firstNumber, secondNumber);
        String number = (thirdNumber == 2) ? Integer.toBinaryString(powNumber) :
                (thirdNumber == 8) ? Integer.toOctalString(powNumber) :
                        (thirdNumber == 10) ? Integer.toString(powNumber) :
                                (thirdNumber == 16) ? Integer.toHexString(powNumber) :
                                        "Incorrect numeral system. System might be in (2, 8, 10, 16)";

        System.out.println(firstNumber + " to the power of " + secondNumber + " in "
                + thirdNumber + "-numeral system  equals: " + number);
    }

}
