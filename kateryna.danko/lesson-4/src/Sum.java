
public class Sum {

    public static void main(String[] args) {

        System.out.println("You enter the first number: "+ args[0]);
        int number1 = Integer.parseInt(args[0]);
        System.out.println("You enter the second number: "+ args[1]);
        int number2 = Integer.parseInt(args[1]);

        System.out.println("Sum of two numbers is: " + (number1+number2));

    }
}
