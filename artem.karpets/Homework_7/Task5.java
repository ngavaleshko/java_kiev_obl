package com.company;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        int[] arr = {22, 344, 23, 1, 3, 84, 0};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nEnter the number of elements of the array");
        Scanner scan = new Scanner(System.in);
        int numb = scan.nextInt();
        sum(arr, numb);
    }

    static void sum(int[] arr, int numb) {
        int sum = 0;
        if (numb < arr.length && numb >= 0) {
            for (int i = 0; i <= numb; i++) {
                sum += arr[i];
            }
            System.out.println("Sum is: " + sum);
        } else {
            System.out.println("Mistake");
        }

    }


}

