package com.company;

public class Task2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 55; i += 2) {
            count++;
            if (count == 55) {
                break;
            }
            System.out.println(i);
        }
    }
}
