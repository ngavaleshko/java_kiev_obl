package com.company;

public class Task7 {
    public static void main(String[] args) {
        int days = Integer.parseInt(args[0]);
        int rent = 40;
        if (days > 5 && days <= 7) {
            int discount = 20;
            System.out.println("Rent sum = " + ((days * rent) - discount));
        } else if (days > 7) {
            int discount = 50;
            System.out.println("Rent sum = " + ((days * rent) - discount));
        } else {
            System.out.println(days * rent);
        }
    }
}
