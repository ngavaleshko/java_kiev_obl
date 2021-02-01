public class Task7HW5 {
    public static void main(String[] args) {
        final int ONE_DAY = 40;
        final String ERROR = "Значение не может быть равное 0 или отрицательным";
        int days = Integer.parseInt(args[0]);
        int sale;
        if (days <= 0) {
            System.out.println(ERROR);
        } else if (days <= 5) {
            sale = 0;
            print(days, ONE_DAY, sale);
        } else if (days > 5 && days <= 7) {
            sale = 20;
            print(days, ONE_DAY, sale);
        } else if (days > 7) {
            sale = 50;
            print(days, ONE_DAY, sale);
        }
    }

    private static void print(int days, int oneDay, int sale) {
        int result;
        final String TEXT = "К оплате: ";
        final String TEXT2 = ". Сумма скидки = ";
        result = days * oneDay - sale;
        System.out.println(TEXT + result + TEXT2 + sale + "грн");
    }
}


