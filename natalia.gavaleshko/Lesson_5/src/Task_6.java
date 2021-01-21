public class Task_6 {
    public static void main(String[] args) {
        int sum = Integer.valueOf(args[0]);
        String feelings = String.valueOf(args[1]);
        System.out.println("sum = " + sum + ", " + "feel = " + feelings);
        operation(feelings, sum);
    }

    private static void operation(String feelings, int sum) {
        double result;
        if (sum <= 0) {
            System.out.println("The sum of the receipt could not be 0 or less. Please try again");
        }
        if (feelings != ("terrible") || feelings != ("poor") || feelings != ("good") || feelings != ("great") || feelings != ("exellent")) {
            System.out.println("Wrong feeling. Please fell something else. For example: terrible, poor,good, ");
        } else {
        if (feelings.equals("terrible") || feelings.equals("poor") || feelings.equals("good") || feelings.equals("great") || feelings.equals("exellent")) {
            switch (feelings) {
                case "terrible":
                    result = sum + sum;
                    System.out.println("result = sum + 0% = " + result);
                    break;
                case "poor":
                    result = sum * 0.05 + sum;
                    System.out.println("result = sum + 5% = " + result);
                    break;
                case "good":
                    result = sum * 0.1 + sum;
                    System.out.println("result = sum + 10% = " + result);
                    break;
                case "great":
                    result = sum * 0.15 + sum;
                    System.out.println("result = sum + 15% = " + result);
                    break;
                case "exellent":
                    result = sum * 0.20 + sum;
                    System.out.println("result = sum + 20% = " + result);
                    break;
            }

        }
    }
}
    }

