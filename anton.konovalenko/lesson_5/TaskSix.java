public class TaskSix {
    public static void main(String[] args) {
        int toPay = Integer.parseInt(args[0]);
        float tip;
        String serviceLevel = args[1];

        if (serviceLevel.toLowerCase().equals("terrible")){
            tip = 0;
            System.out.println("Service level is " + serviceLevel.toUpperCase() + ". You need to pay " + (tip + toPay) + ". Tips summ: " + tip);
        } else if (serviceLevel.toLowerCase().equals("poor")){
            tip = (float) (toPay * 0.05);
            System.out.println("Service level is " + serviceLevel.toUpperCase() + ". You need to pay " + (tip + toPay) + ". Tips summ: " + tip);
        } else if (serviceLevel.toLowerCase().equals("good")){
            tip = (float) (toPay * 0.1);
            System.out.println("Service level is " + serviceLevel.toUpperCase() + ". You need to pay " + (tip + toPay) + ". Tips summ: " + tip);
        } else if (serviceLevel.toLowerCase().equals("great")){
            tip = (float) (toPay * 0.15);
            System.out.println("Service level is " + serviceLevel.toUpperCase() + ". You need to pay " + (tip + toPay) + ". Tips summ: " + tip);
        } else if (serviceLevel.toLowerCase().equals("excellent")){
            tip = (float) (toPay * 0.2);
            System.out.println("Service level is " + serviceLevel.toUpperCase() + ". You need to pay " + (tip + toPay) + ". Tips summ: " + tip);
        } else {
            System.out.println("Please, type the correct service level:\n'terrible, poor, good, great, excellent'");
        }
    }
}
