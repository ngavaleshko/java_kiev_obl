public class Task4HW5 {
    public static void main(String[] args) {
        int firstNum = Integer.parseInt(args[0]);
        int secondNum = Integer.parseInt(args[1]);
        int thirdNum = Integer.parseInt(args[2]);
        if (firstNum <= secondNum && firstNum <= thirdNum) {
            if (firstNum != secondNum && firstNum != thirdNum) {
                System.out.println(firstNum);

            } else if (firstNum == thirdNum && firstNum == secondNum) {
                System.out.println(firstNum + "  " + secondNum + "  " + thirdNum);
            } else if (firstNum == secondNum) {
                System.out.println(firstNum + "  " + secondNum);
            } else if (firstNum == thirdNum) {
                System.out.println(firstNum + "  " + thirdNum);
            }

        } else if (secondNum <= firstNum && secondNum <= thirdNum) {
            if (secondNum != firstNum && secondNum != thirdNum)
                System.out.println(secondNum);
            else if (secondNum == thirdNum) {
                System.out.println(secondNum + "  " + thirdNum);
            }

        } else {
            System.out.println(thirdNum);
        }
    }
}
