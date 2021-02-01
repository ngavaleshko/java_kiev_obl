import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input First number:");
        int num = in.nextInt();
        System.out.println("Input Second number:");
        int num2 = in.nextInt();
        float result = num/num2;
        if (num%num2==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
