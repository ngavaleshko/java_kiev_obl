public class SevenFlatRent {
    public static void main(String[] args) {
        int days = Integer.parseInt(args[0]);
        int money = 0;
        if (days <= 4) {
            money = days * 40;
        } else if (days > 4 && days < 7) {
            money = (days * 40) - 20;
        } else if (days >= 7) {
            money = (days * 40) - 50;
        }
        System.out.println("rental price for " + days + " days = " + money);
    }
}
