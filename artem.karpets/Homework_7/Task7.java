package com.company;

public class Task7 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 8, 43, 75, 20};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        EvenOdd(arr);
    }

    static void EvenOdd(int[] arr) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2) == 0) {
                even += arr[i];
            } else {
                odd += arr[i];
            }
        }
        System.out.println("\n" + even);
        System.out.println(odd);
    }
}
