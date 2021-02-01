package com.company;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        System.out.println("Enter the number: ");
        Scanner scan = new Scanner(System.in);
        int numb = scan.nextInt();
        System.out.println(" choose " + Integer.toBinaryString(numb));
        int bit = scan.nextInt();
        bit--;
        int buf = 1 << bit;
        int result = bit ^ buf;
        System.out.println(Integer.toBinaryString(result) + " in decimal = " + result);
    }
}




