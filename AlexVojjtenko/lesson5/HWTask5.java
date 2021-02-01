public class HWTask5 {

    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(args[0]);
        String text = args[1];
        int secondNumber = Integer.parseInt(args[2]);

        if(text.equals("+")){
            System.out.println("Sum of numkbers is : "+(firstNumber+secondNumber));
        }else if(text.equals("-")){
            System.out.println("Difference of numbers is : "+ (firstNumber-secondNumber));
        }else if(text.equals("*")){
            System.out.println("Multiply of numbers is : "+(firstNumber*secondNumber));
        }else if(text.equals("/")){
            System.out.println("Division of numbers is : "+(firstNumber/secondNumber));
        }else if(text.equals("%")){
            System.out.println("Remainder of division is : "+(firstNumber%secondNumber));
        }else if(text.contains("|")){
            System.out.println("Absolute value of first number is : "+ (Math.abs(firstNumber))+
                    " \nAbsolute value of second number is : "+(Math.abs(secondNumber)));
        }
    }
}
