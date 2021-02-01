public class HWTask4 {

    public static void main(String[] args) {
        int numberOne = Integer.parseInt(args[0]);
        int numberTwo = Integer.parseInt(args[1]);
        int numberThree = Integer.parseInt(args[2]);

        if (numberOne == numberTwo && numberTwo == numberThree) {
            System.out.println(numberOne + " " + numberTwo + " " + numberThree);
        } else if (numberOne == numberTwo && numberOne > numberThree) {
            System.out.println(numberOne + " " + numberTwo);
        } else if (numberOne == numberThree && numberThree > numberTwo) {
            System.out.println(numberOne + " " + numberThree);
        } else if (numberTwo == numberThree && numberThree > numberOne) {
            System.out.println(numberTwo + " " + numberThree);
        } else if (numberOne > numberTwo && numberOne > numberThree) {
            System.out.println(numberOne);
        } else if (numberTwo > numberOne && numberTwo > numberThree) {
            System.out.println(numberTwo);
        } else {
            System.out.println(numberThree);
        }
    }
}
