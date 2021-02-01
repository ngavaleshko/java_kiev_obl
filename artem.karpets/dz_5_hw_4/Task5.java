package com.company;

public class Task5 {
    public static void main(String[] args) {

        int numbOne = Integer.parseInt(args[0]);
        int numbTwo = Integer.parseInt(args[1]);
        String sign = args[2];
        double res;

        if (sign.equals("/")) {
            res = numbOne / numbTwo;
            System.out.println(res);
        } else if (sign.equals("*")) {
            res = numbOne * numbTwo;
            System.out.println(res);
        } else if (sign.equals("+")) {
            res = numbOne + numbTwo;
            System.out.println(res);
        } else if (sign.equals("-")) {
            res = numbOne - numbTwo;
            System.out.println(res);
        } else if (sign.equals("%")) {
            res = numbOne % numbTwo;
            System.out.println(res);
        } else if (sign.equals("abs")) {
            res = Math.abs(numbOne);
            System.out.println(res);
        }
    }
}




