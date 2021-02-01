package com.company;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 25, 84, 92, 45, 34, 5};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        Arrays.sort(arr);
        System.out.println("\nMin num = " + arr[0]);
        System.out.println("Max num = " + arr[arr.length - 1]);
    }
}

