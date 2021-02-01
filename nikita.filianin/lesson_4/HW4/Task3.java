public class Task3 {
    public static void main(String[] args) {
        System.out.println("First Number: " + args[0]);
        String firstNum = args[0];
        System.out.println("Second Number: " + args[1]);
        String secondNum = args[1];
        System.out.println("Numeric System (2 or 16): " + args[2]);
        String thirdNum = args[2];
        int pow = (int) Math.pow(Integer.parseInt(firstNum), Integer.parseInt(secondNum));
        String result = null;
        if(Integer.parseInt(thirdNum) == 2) {
            result = Integer.toBinaryString(pow);
        }
        else if (Integer.parseInt(thirdNum) == 16) {
            result = Integer.toHexString(pow);
        }
        System.out.println(result);
    }
}

public class Task3 {
    public static void main(String[] args) {
        System.out.println("First Number: " + args[0]);
        String firstNum = args[0];
        System.out.println("Second Number: " + args[1]);
        String secondNum = args[1];
        System.out.println("Numeric System (2 or 16): " + args[2]);
        String thirdNum = args[2];
        int pow = (int) Math.pow(Integer.parseInt(firstNum), Integer.parseInt(secondNum));
        String result = null;
        if(Integer.parseInt(thirdNum) == 2) {
            result = Integer.toBinaryString(pow);
        }
        else if (Integer.parseInt(thirdNum) == 16) {
            result = Integer.toHexString(pow);
        }
        System.out.println(result);
    }
}

