package com.company;

public class Task4 {
    public static void main(String[] args) {
        int numbOne = Integer.parseInt(args[0]);
        int numbTwo = Integer.parseInt(args[1]);
        int numbThree = Integer.parseInt(args[2]);
        if (numbOne < numbTwo || numbOne < numbThree) {
            if (numbOne == numbTwo && numbOne < numbThree) {
                System.out.println("min numb = " + numbOne + " and " + numbTwo);
            } else if (numbOne == numbThree && numbOne < numbTwo) {
                System.out.println("min numb =  " + numbOne + " and " + numbThree);
            } else System.out.println("min numb =  " + numbOne);
        } else if (numbTwo < numbOne || numbTwo < numbThree) {
            if (numbTwo == numbOne && numbTwo < numbThree) {
                System.out.println("min numb = " + numbTwo + " and " + numbOne);
            } else if (numbTwo == numbThree && numbTwo < numbOne) {
                System.out.println("min numb = " + numbTwo + " and " + numbThree);
            } else System.out.println("min numb = " + numbTwo);
        } else if (numbThree < numbOne || numbThree < numbTwo) {
            if (numbThree == numbOne && numbThree < numbTwo) {
                System.out.println("min numb = " + numbThree + " and " + numbOne);
            } else if (numbThree == numbTwo && numbThree < numbOne) {
                System.out.println("min numb = " + numbThree + " and " + numbTwo);
            } else System.out.println("min numb = " + numbThree);

        }
    }
}
