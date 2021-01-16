package lesson1;

import java.util.Scanner;

public class SumOfTwo() {
    public static void main (String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Input a number for var1: ");
        System.out.print("Input a number for var2: ");
        int var1 = in.nextInt();
        int var2 = in.nextInt();
        int Sum = var1+var2;
        System.out.print("Sum of Two Variables is : ");
    }