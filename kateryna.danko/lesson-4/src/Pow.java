
public class Pow {
    public static void main(String[] args) {

        System.out.println("You enter the first number: "+ args[0]);
        int integerNumber1 = Integer.parseInt(args[0]);
        System.out.println("You enter the second number: "+ args[1]);
        int integerNumber2 = Integer.parseInt(args[1]);
        System.out.println("You enter the third number: "+ args[2]);
        int integerNumber3 = Integer.parseInt(args[2]);

        int pow = (int)Math.pow(integerNumber1, integerNumber2);
        String stringPow = Integer.toString(pow);

        int integerPowInNumberSystem  = Integer.parseInt(stringPow, integerNumber3);


        System.out.println("Raised the first number to the power of the second number " +
                "and deduced in the " +
                "number system entered by the third number: " + integerPowInNumberSystem);
    }
}
