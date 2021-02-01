package com.company;

public class Task8 {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 100000; i <= 999999; i++) {
            int numb1 = i / 100000 % 10;
            int numb2 = i / 10000 % 10;
            int numb3 = i / 1000 % 10;
            int numb4 = i / 100 % 10;
            int numb5 = i / 10 % 10;
            int numb6 = i % 10;
            if (numb1 + numb2 + numb3 == numb4 + numb5 + numb6) {
                num = i;
                System.out.println("Ticket № = " + num);
            }
        }
    }
}
