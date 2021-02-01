public class Task5 {
    public static void main(String[] args) {

        float result = 0;
        int a = Integer.parseInt(args[0]);
        String s = args[1];
        int b = Integer.parseInt(args[2]);

        if (s.equals("/")){
            if (a == 0 || b == 0) {
                System.out.println("Невозможно делить на 0!");
            }
            else result = (float) a / (float) b;
            System.out.println(result);
        }
        else if (s.equals("+")){
            result = a + b;
            System.out.println(result);
        }
        else if (s.equals("-")){
            result = a - b;
            System.out.println(result);
        }
        else if (s.equals("*")){
            result = a * b;
            System.out.println(result);
        }
        else if (s.equals("%")){
            result = a % b;
            System.out.println(result);
        }
        else if (s.equals("abs")){
            result = Math.abs(a);
            System.out.println(result);
        }
    }
}

