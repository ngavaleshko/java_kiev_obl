import java.util.Arrays;
import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        System.out.println("Which task to run: ");
        Scanner in = new Scanner(System.in);
        int task = in.nextInt();

        switch (task){
            case 1: taskOne();
            break;
            case 2: taskTwo();
            break;
            case 3: taskThree();
            break;
            case 4: taskFour();
            break;
            case 5: taskFive();
            break;
            case 6: taskSix();
            break;
            case 7: taskSeven();
            break;
            case 8: taskEight();
            break;
            case 9: taskNine();
            break;
            case 10: taskTen();
            break;
        }
    }

    public static void taskOne(){
        //Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
        for (int i = 1000; i <= 2000; i += 3) {
            System.out.println(i);
        }
    }

    public static void taskTwo(){
        //Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17...
        int j = 0;
        for (int i = 1; j <= 55; i+=2) {
            System.out.println(i);
            j++;
        }
    }

    public static void taskThree(){
        //Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….

        for (int i = 90; i >= 0 ; i -= 5) {
            System.out.println(i);
        }
    }

    public static void taskFour(){
        //Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 …

        int i = 0;
        int j = 2;
        while (i != 20) {
            System.out.println(j);
            j *= 2;
            i++;
        }
    }

    public static void taskFive(){
        //Найти сумму первых n элементов массива

        Scanner in = new Scanner(System.in);
        System.out.println("Array length:");
        int arrLength = in.nextInt();
        int[] arr = new int[arrLength];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10);
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nThe sum of how many elements:");
        int n = in.nextInt();
        int summ = 0;

        for (int i = 0; i < n; i++) {
            summ += arr[i];
        }

        System.out.println("Summ of the first " + n + " elements is: " + summ);
    }

    public static void taskSix(){
        //Найти минимальный и максимальный элемент массива

        Scanner in = new Scanner(System.in);
        System.out.println("Array length:");
        int arrLength = in.nextInt();
        int[] arr = new int[arrLength];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)((Math.random() * 12) - 6);
            System.out.print(arr[i] + " ");
        }

        int min = arr[0];
        int max = arr[0];

        for (int value : arr) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }

        System.out.println("\nMin element of aray is: " + min);
        System.out.println("Max element of aray is: " + max);
    }

    public static void taskSeven(){
        //Найти сумму всех четных и сумму всех нечетных элементов массива

        Scanner in = new Scanner(System.in);
        System.out.println("Array length:");
        int arrLength = in.nextInt();
        int[] arr = new int[arrLength];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10);
            System.out.print(arr[i] + " ");
        }

        int summOfEven = 0;
        int summOfOdd = 0;

        for (int value : arr) {
            if (value % 2 == 0) {
                summOfEven += value;
            } else {
                summOfOdd += value;
            }
        }

        System.out.println("\nSumm of even numbers: " + summOfEven);
        System.out.println("Summ of odd numbers: " + summOfOdd);
    }

    public static void taskEight(){
//        Найти все счастливые билеты от 100000 до 999999 :
//        билет счастливый если сумма первых трех цифр равна сумме трех последних
//        например, 123312: 1+2+3==3+1+2

        int lucky = 0;

        for (int i = 100000; i <= 999999; i++) {
            int i1 = i / 100000 % 10;
            int i2 = i / 10000 % 10;
            int i3 = i / 1000 % 10;
            int i4 = i / 100 % 10;
            int i5 = i / 10 % 10;
            int i6 = i % 10;

            if ((i1 + i2 + i3) == (i4 + i5 + i6)){
                lucky++;
                System.out.println(i);
            }
        }
        System.out.println(lucky);
    }
    public static void taskNine(){
//        Создайте программу которая устанавливает введеный номер бита в 1 у введенного числа,
//        выведите на экран полученое число в двоичной и десятеричной системе счисления

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = in.nextInt();
        System.out.println(number + " = " + Integer.toBinaryString(number));
        System.out.println("Enter the bit number, that should be changed: ");
        int bitNumber = in.nextInt();
        bitNumber--;
        int buffer = 0;
        buffer = 1 << bitNumber;
        int result = bitNumber ^ buffer;
        System.out.println(Integer.toBinaryString(result) + " in decimal = " + result);

    }
    public static void taskTen(){
//        Вывести первые 5 минимальных элементов массива

        Scanner in = new Scanner(System.in);
        System.out.println("Array length:");
        int arrLength = in.nextInt();
        int[] arr = new int[arrLength];
        int howManyShow = 5;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)((Math.random() * 12) - 6);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr [j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        System.out.println("Five minimum numbers of array: ");
        for (int i = arr.length - 1; i > arr.length - howManyShow - 1; i--) {
            System.out.print(arr[i] + " ");
        }
    }

}
