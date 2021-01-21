import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input First number:");
        int num1 = in.nextInt();
        System.out.println("Input Second number:");
        int num2 = in.nextInt();
        System.out.println("Input Third number:");
        int num3 = in.nextInt();
        if ((num1 < num2) && (num1 < num3)) {
            System.out.println("min number is: "+num1);
        } else if ((num2 < num1) && (num2 < num3)){
            System.out.println("min number is: "+num2);
        } else if ((num3 < num1) && (num3 < num2)) {
            System.out.println("min number is: "+num3);
        }else if ((num1 == num2) && (num1 < num3)) {
            System.out.println("min number is: "+num1+", "+num2);}
        else if ((num2 < num1) && (num2 == num3)){
            System.out.println("min number is: "+num2+ ",  "+num3);}
        else if ((num1 == num3) && (num3 <num2)){
            System.out.println("min number is: "+num1+ ",  "+num3);}
        else if ((num1 == num3) && (num3 ==num2)){
            System.out.println("min number is: "+num1+ ",  "+num3+", "+num2);}
    }
}
