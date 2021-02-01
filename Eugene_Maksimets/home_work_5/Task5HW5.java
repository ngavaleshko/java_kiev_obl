public class Task5HW5 {
    public static void main(String[] args) {
        int firstNum = Integer.parseInt(args[0]);
        String key = args[1];
        int secondNum = Integer.parseInt(args[2]);
        print(firstNum, secondNum, key);

    }

    private static void print(int firstNum, int secondNum, String key) {
        int result;
        if (key.equals("+") || key.equals("-") || key.equals("*") || key.equals("/") || key.equals("%") || key.equals("abs")) {
            switch (key) {
                case "+":
                    result = firstNum + secondNum;
                    System.out.println(firstNum + " + " + secondNum + " = " + result);
                    break;
                case "-":
                    result = firstNum - secondNum;
                    System.out.println(firstNum + " - " + secondNum + " = " + result);
                    break;
                case "*":
                    result = firstNum * secondNum;
                    System.out.println(firstNum + " * " + secondNum + " = " + result);
                    break;
                case "/":
                    result = firstNum / secondNum;
                    System.out.println(firstNum + " / " + secondNum + " = " + result);
                    break;
                case "%":
                    result = firstNum % secondNum;
                    System.out.println(firstNum + " % " + secondNum + " = " + result);
                    break;
                case "abs":
                    result = Math.abs(firstNum);
                    int result2 = Math.abs(secondNum);
                    System.out.println(firstNum + " по модулю = " + result + "\n" +
                            secondNum + " по модулю = " + result2);
                    break;
            }

        } else {
            final String ERROR = "Введите одно из следующих значений для второго аргумента\n" +
                    "'*' - умножение;\n" +
                    "'/' - деление;\n" +
                    "'+' - сложение;\n" +
                    "'-' - вычитание;\n" +
                    "'%' - остаток от деления (%);\n" +
                    "'abs' - нахождение модуля чисел";
            System.out.println(ERROR);
        }
    }
}
