public class Task7 {
    public static void main(String[] args) {
        int daysCounter = Integer.parseInt(args[0]);
        int rent = 40;
        int discount;

        if (daysCounter >= 5 && daysCounter < 7) {
            discount = 20;
            System.out.println("If you stay here for " + daysCounter + " days, you will need to pay " + ((daysCounter * rent)-discount));
        } else if (daysCounter >= 7) {
            discount = 50;
            System.out.println("If you stay here for " + daysCounter + " days, you will need to pay " + ((daysCounter * rent)-discount));
        }
    }
}

