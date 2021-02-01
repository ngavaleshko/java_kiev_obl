public class FiveCalculator {
    public static void main(String[] args) {
        int fistNumber = Integer.parseInt(args[0]);
        String operation = args[1];
        int secondNumb = Integer.parseInt(args[2]);
        int sum;
        // делал с помощью If else, IDEA сама порекомендовала использовать switch =)

        switch (operation) {
            case "+":
                sum = fistNumber + secondNumb;
                System.out.println(sum);
                break;
            case "-":
                sum = fistNumber - secondNumb;
                System.out.println(sum);
                break;
            case "*":
                sum = fistNumber * secondNumb;
                System.out.println(sum);
                break;
            case "/":
                sum = fistNumber / secondNumb;
                System.out.println(sum);
                break;
            case "%":
                sum = fistNumber % secondNumb;
                System.out.println(sum);
                break;
            case "abs":
            case "|":
                System.out.println(Math.abs(fistNumber) + " and " + Math.abs(secondNumb));
                break;
            default:
                System.out.println("Please  enter correct characters");
                break;
        }

    }
}
