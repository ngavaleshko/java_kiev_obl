import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input First number:");
        int num1 = in.nextInt();
        System.out.println("Input Second number:");
        int num2 = in.nextInt();
        float result1= (num1/10);
        float result2=(num2/10);
        if(result1>result2){
            System.out.println(num2);
        }
        else{
            System.out.println(num1);
        }
    }
}
