public class Task4 {

    public static void main(String[] args) {
        int firstCatet = Integer.parseInt(args[0]);
        int secondCatet = Integer.parseInt(args[1]);
        int hypotenuse = (int) Math.sqrt(firstCatet * firstCatet + secondCatet * secondCatet);

        System.out.println("Hypotenuse is : " + hypotenuse);

    }
}
