package com.company;

public class Task6 {
    public static void main(String[] args) {
        int money = Integer.parseInt(args[0]);
        String service = args[1];
        double tip;

        if (service.equals("terrible")) {
            System.out.println("Service is " + service + ". You need to pay " + (money) + ". and no tips: ");
        } else if (service.equals("poor")) {
            tip = (money * 0.05);
            System.out.println("Service is " + service + ". You need to pay " + (tip + money) + ". Tips summ: " + tip);
        } else if (service.equals("good")) {
            tip = (money * 0.1);
            System.out.println("Service is " + service + ". You need to pay " + (tip + money) + ". Tips summ: " + tip);
        } else if (service.equals("great")) {
            tip = (money * 0.15);
            System.out.println("Service  is " + service + ". You need to pay " + (tip + money) + ". Tips summ: " + tip);
        } else if (service.equals("excellent")) {
            tip = (money * 0.2);
            System.out.println("Service  is " + service + ". You need to pay " + (tip + money) + ". Tips summ: " + tip);
        }
    }
}

