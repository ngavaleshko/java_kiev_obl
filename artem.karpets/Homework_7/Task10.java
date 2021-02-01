package com.company;

import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {

        int[] arr = new int[]{10, 20, 38, 95, 43, 45, 78, 44, 38};
        Arrays.sort(arr);
        System.out.println("Min array");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
