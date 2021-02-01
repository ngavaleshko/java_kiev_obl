public class Task6HW5 {
    public static void main(String[] args) {
        float sum = Float.parseFloat(args[0]);
        String key = args[1];
        final String ERROR = "Значение не может быть равное 0 или отрицательным";
        if (sum <= 0) {
            System.out.println(ERROR);
        } else {

            if (key.equals("terrible") || key.equals("poor") || key.equals("good") ||
                    key.equals("great") || key.equals("excellent")) {
                switch (key) {
                    case "terrible":
                        print(sum, 0);
                        break;
                    case ("poor"):
                        print(sum, 5);
                        break;
                    case ("good"):
                        print(sum, 10);
                        break;
                    case ("great"):
                        print(sum, 15);
                        break;
                    case ("excellent"):
                        print(sum, 20);
                        break;

                }
            } else {
                System.out.println("Неверное значаение, введите одно из следующих значений:\n" +
                        "- terrible (оставить - 0%)\n" +
                        "- poor (оставить - 5%)\n" +
                        "- good (оставить - 10%)\n" +
                        "- great (оставить - 15%)\n" +
                        "- excellent (оставить - 20%) ");


            }
        }
    }

    private static void print(float sum, int proc) {
        float result;
        final String TEXT = "Сумма чаевых = ";
        if (proc == 0) {
            result = 0;
        } else {
            result = sum / 100 * proc;
        }
        System.out.println(TEXT + result);
    }
}
