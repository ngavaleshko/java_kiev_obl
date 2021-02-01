
import java.util.Scanner;

public class HW7Task9 {
    public static void main(String[] args) {
        System.out.println("Введите значение в десятичной системе счистления: ");
        Scanner getNum = new Scanner(System.in);
        int firstNum = getNum.nextInt();
        System.out.println(firstNum + " в двоичной системе исчсления = " + Integer.toBinaryString(firstNum));
        System.out.println("Введите номер бита который нужно заменит(Отсчет с последнего бита): ");
        int oneNum = getNum.nextInt();
        oneNum--;
        int firstResult = 0;
        firstResult = 1 << oneNum;
        int result = firstNum ^ firstResult;
        System.out.println(Integer.toBinaryString(result) + " в десятичной системе исчсления = " + result);
    }
}
