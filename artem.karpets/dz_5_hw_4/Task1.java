package com.company;

public class Task1 {

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]) % 2;
        if (number == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
