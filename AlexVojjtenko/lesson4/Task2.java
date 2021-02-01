public class Task2 {

    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);
        int thirdNumber = Integer.parseInt(args[2]);
        int maxValue = firstNumber < secondNumber ? secondNumber : firstNumber;
        maxValue = maxValue < thirdNumber ? thirdNumber : maxValue;
        System.out.println("Maximum number is : " + maxValue);
    }
}
