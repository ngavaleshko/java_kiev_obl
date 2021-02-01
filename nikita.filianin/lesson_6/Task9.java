import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("Введите значение в десятичной системе счисления: ");
        Scanner getNumber = new Scanner(System.in);
        int firstNum = getNumber.nextInt();
        System.out.println(firstNum + " в двоичной системе счисления = " + Integer.toBinaryString(firstNum));
        System.out.println("Номер бита, который нужно заменить: ");
        int oneNum = getNumber.nextInt();
        oneNum--;
        int firstResult = 0;
        firstResult = 1 << oneNum;
        int result = firstNum ^ firstResult;
        System.out.println(Integer.toBinaryString(result) + " в десятичной системе счисления = " + result);
    }
}