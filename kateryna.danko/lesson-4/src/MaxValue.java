
public class MaxValue {
    public static void main(String[] args) {
        System.out.println("You enter the first number: "+ args[0]);
        int integerNumber1 = Integer.parseInt(args[0]);
        System.out.println("You enter the second number: "+ args[1]);
        int integerNumber2 = Integer.parseInt(args[1]);
        System.out.println("You enter the third number: "+ args[2]);
        int integerNumber3 = Integer.parseInt(args[2]);


        System.out.println("Max value is: " + ((integerNumber1 > integerNumber2) &&
                (integerNumber1 > integerNumber3) ? integerNumber1 : (integerNumber2 > integerNumber1) &&
                (integerNumber2>integerNumber3) ?
                integerNumber2 : integerNumber3));

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the first integer number:");
//        int integerNumber1 = Integer.parseInt(scanner.nextLine());
//
//        System.out.println("Enter the second integer number:");
//        int integerNumber2 = Integer.parseInt(scanner.nextLine());
//
//        System.out.println("Enter the third integer number:");
//        int integerNumber3 = Integer.parseInt(scanner.nextLine());
//
//        System.out.println("Max value is: " + ((integerNumber1 > integerNumber2) &&
//                (integerNumber1 > integerNumber3) ? integerNumber1 : (integerNumber2 > integerNumber1) &&
//                (integerNumber2>integerNumber3) ?
//                integerNumber2 : integerNumber3));
    }
}
