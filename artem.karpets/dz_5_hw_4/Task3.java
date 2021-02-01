package com.company;

public class Task3 {
    public static void main(String[] args) {
        int numberOne = Math.abs(Integer.parseInt(args[0]) - 10);
        int numberTwo = Math.abs(Integer.parseInt(args[1]) - 10);
        if (numberOne < numberTwo) {
            System.out.println("Cloner number = " + numberOne);
        } else if (numberOne > numberTwo) {
            System.out.println("Closer number = " + numberTwo);
        } else {
            System.out.println("Numbers are equal");
        }
    }
}
