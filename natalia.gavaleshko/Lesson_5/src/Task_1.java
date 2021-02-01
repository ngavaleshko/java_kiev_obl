import java.util.Scanner;

public class Task_1 {
       public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input First number:");
        int num = in.nextInt();
        if (num%2==0){
            System.out.println(num+ "  is even number: ");
        }
        else{
            System.out.println(num+ "  is odd number: ");
        }
    }
}
