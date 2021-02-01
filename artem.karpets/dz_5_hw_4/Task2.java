package com.company;

public class Task2 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]) % Integer.parseInt(args[1]);
        if (number == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
