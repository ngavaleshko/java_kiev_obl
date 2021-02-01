import java.sql.SQLOutput;

import static jdk.nashorn.internal.objects.Global.print;

public class Task_5 {
    public static void main(String[] args) {
        int var1 = Integer.valueOf(args[0]);
        String sign = String.valueOf(args[1]);
        int var2 = Integer.valueOf(args[2]);
        System.out.println("var1 = "+var1+", "+"sign = "+sign+", "+"var2 = "+var2+", ");
        if ((var1==0)||(var2==0)){
            System.out.println("Please choose another number, 0 - is not an option");}
        operation(var1, sign, var2);

    }

    private static void operation(int var1, String sign, int var2) {
        int result;
        int result1;
        if (sign.equals("*") || sign.equals("/") || sign.equals("+") || sign.equals("-") || sign.equals("%") || sign.equals("Math.abs")){
            switch (sign) {
                case "*":
                    result = var1 * var2;
                    System.out.println("var1 * var2 = " + result);
                    break;
                case "/":
                    result = var1 / var2;
                    System.out.println("var1 / var2 = " + result);
                    break;
                case "+":
                    result = var1 / var2;
                    System.out.println("var1 + var2 = " + result);
                    break;
                case "-":
                    result = var1 - var2;
                    System.out.println("var1 - var2 = " + result);
                    break;
                case "%":
                    result = var1 % var2;
                    System.out.println("var1 % var2 = " + result);
                    break;
                case "Math.abs":
                    result = Math.abs(var1);
                    result1 = Math.abs(var2);
                    System.out.println("Math.abs (var1)" + result);
                    System.out.println("Math.abs (var2)" + result1);
                    break;
                    default:
                        System.out.println("Invalid Input!");
            }
        }
    }
}
