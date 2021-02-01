public class TaskFive {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        String sign = args[1];
        int b = Integer.parseInt(args[2]);
        float res = 0;

        if (sign.equals("/")){
            if (a == 0 || b == 0) {
                System.out.println("You can't divide by zero!");
            } else res = (float) a / (float) b;
            System.out.println(res);
        } else if (sign.equals("*")){
            res = a * b;
            System.out.println(res);
        } else if (sign.equals("+")){
            res = a + b;
            System.out.println(res);
        } else if (sign.equals("-")){
            res = a - b;
            System.out.println(res);
        } else if (sign.equals("%")){
            res = a % b;
            System.out.println(res);
        } else if (sign.equals("abs")){
            res = Math.abs(a);
            System.out.println(res);
        }
    }
}
